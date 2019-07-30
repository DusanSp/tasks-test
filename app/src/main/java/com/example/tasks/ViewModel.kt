package com.example.tasks

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {

    private var _data = MutableLiveData<Data>().apply {
        value = Data()
    }

    val data: LiveData<Data>
        get() = _data

    fun onClick() {
        Log.d("---->", data.value?.name?.get() ?: "")
    }
}
