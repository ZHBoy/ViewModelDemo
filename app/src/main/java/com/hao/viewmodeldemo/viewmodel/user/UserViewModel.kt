package com.hao.viewmodeldemo.viewmodel.user

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hao.viewmodeldemo.ThreadUtils
import com.hao.viewmodeldemo.model.UserInfo
import com.hao.viewmodeldemo.viewmodel.AppStoreOwner

class UserViewModel() : ViewModel() {

    private

    val userLiveData = UserLiveData()

    fun refresh(isForceRefresh: Boolean) {
        if (userLiveData.value != null && !isForceRefresh) {
        } else {
            // TODO: 2021/5/13 去做网络请求
            ThreadUtils.runOnWorkThread(Runnable {
                //模拟成功得到userinfo
                val userInfo = UserInfo()
                userLiveData.value = userInfo
            })
        }
    }

    companion object {

        private const val VIEW_MODEL_KEY_USER = "view_model_key_user"

        private val viewModelProvider: ViewModelProvider by lazy {
            ViewModelProvider(AppStoreOwner, ViewModelProvider.NewInstanceFactory())
        }

        fun getInstance() = viewModelProvider.get(VIEW_MODEL_KEY_USER, UserViewModel::class.java)
    }
}
