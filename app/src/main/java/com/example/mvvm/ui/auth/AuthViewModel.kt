package com.example.mvvm.ui.auth

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel

class AuthViewModel:ViewModel() {

    var email:String?=null
    var password:String?=null
    var authListener:AuthListener?=null

    fun onLoginButtonClick(view:View){
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()){
            Toast.makeText(view.context,"Please Enter details",Toast.LENGTH_SHORT).show()
            authListener?.onFailure("Invalid Email or password")
            return
        }
        authListener?.onSuccess()

    }

}