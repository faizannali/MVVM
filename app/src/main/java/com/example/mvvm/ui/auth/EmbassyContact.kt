package com.example.mvvm.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.example.mvvm.R
import com.example.mvvm.databinding.ActivityEmbassyContactsBinding
import com.example.mvvm.databinding.ActivityLoginBinding

class EmbassyContact:  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityEmbassyContactsBinding = DataBindingUtil.setContentView(this,R.layout.activity_embassy_contacts)
        val viewModel= ViewModelProviders.of(this).get(AuthViewModel::class.java)

        binding.viewModel=viewModel
    }

}