package com.niro.mvvm_test.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _text = MutableLiveData<String>("")

    var text: LiveData<String> = _text

    fun updateText(typedText: String){
        _text.value = typedText
    }
}
