package com.example.newsinshort.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor() : ViewModel() {

    init {
        Log.d(TAG, "Init block of NewsViewModel")

    }

    fun doSomeThing() {
        println("do some thing")
    }

    companion object {
        const val TAG = "NewsViewModel"
    }

}