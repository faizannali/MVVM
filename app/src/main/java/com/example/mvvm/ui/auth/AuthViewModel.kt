
package com.example.mvvm.ui.auth

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.mvvm.data.repository.UserRepository

class AuthViewModel:ViewModel() {

    var userName:String?=null
    var password:String?=null
    var authListener:AuthListener?=null

    fun onLoginButtonClick(view:View){
        authListener?.onStarted()
        if (userName.isNullOrEmpty() || password.isNullOrEmpty()){
            Toast.makeText(view.context,"Please Enter details",Toast.LENGTH_SHORT).show()
            authListener?.onFailure("Invalid Email or password")
            return
        }
        //this is on success
        val loginResponse=UserRepository().userLogin(userName!!,password!!)
        authListener?.onSuccess(loginResponse)
    }

}