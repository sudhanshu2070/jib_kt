package com.example.iasset_mobile.ui.task

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Task Fragment"
    }
//    val text: LiveData<String> = _text

    val text: LiveData<String> = _text // Expose it as LiveData to avoid direct modification

    // Method to update the value of _text
    fun updateText(newText: String) {
        _text.value = newText
    }
}