package com.example.mvvm.ui.auth

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(msg:String)
}