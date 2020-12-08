package com.example.mvvm.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.mvvm.R
import com.example.mvvm.databinding.ActivityLoginBinding
import com.example.mvvm.uitls.toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(),AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityLoginBinding=DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel=ViewModelProviders.of(this).get(AuthViewModel::class.java)

        binding.viewModel=viewModel
        viewModel.authListener=this

    }

    override fun onStarted() {
        toast("Login Started")
    }

    override fun onSuccess() {
        toast("Login Success")
    }

    override fun onFailure(msg: String) {
        toast(msg)
    }
}