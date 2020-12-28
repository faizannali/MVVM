package com.example.mvvm.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvm.R
import com.example.mvvm.databinding.ActivityLoginBinding
import com.example.mvvm.uitls.gone
import com.example.mvvm.uitls.show
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
        //progressBar.show()
        toast("started")
    }

    override fun onSuccess(loginResponse: LiveData<String>) {
//        progressBar.gone()
        loginResponse.observe(this, Observer {
            toast(it)
        })
    }

    override fun onFailure(msg: String) {
        //progressBar.gone()
        toast(msg)
    }
}