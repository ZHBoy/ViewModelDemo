package com.hao.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hao.viewmodeldemo.viewmodel.user.UserViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //刷新用户信息
        UserViewModel.getInstance().refresh(true)
        UserViewModel.getInstance().userLiveData.observeForever {
            // TODO: 2021/5/13  根据数据更新Ui
        }
    }
}