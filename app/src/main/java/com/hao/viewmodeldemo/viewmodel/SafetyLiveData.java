package com.hao.viewmodeldemo.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.hao.viewmodeldemo.ThreadUtils;

/**
 *
 * 可安全的对 liveData 赋值，当不在 UI 线程时，则调用 postValue 方法
 */
public class SafetyLiveData<T> extends MutableLiveData<T> {
    public void setValue(T newValue) {
        if (ThreadUtils.isUiThread()) {
            super.setValue(newValue);
        } else {
            super.postValue(newValue);
        }
    }
}