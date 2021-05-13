package com.hao.viewmodeldemo.viewmodel

import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner

object AppStoreOwner : ViewModelStoreOwner {

    private val mViewModelStore : ViewModelStore by lazy{
        ViewModelStore()
    }
    override fun getViewModelStore() = mViewModelStore
}