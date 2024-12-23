package com.example.iasset_mobile.ui.task

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Task Fragment"
    }
    val text: LiveData<String> = _text
}