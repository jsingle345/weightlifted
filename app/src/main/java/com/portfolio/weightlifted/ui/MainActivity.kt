package com.portfolio.weightlifted.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.portfolio.weightlifted.R
import com.portfolio.weightlifted.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(applicationContext))
        setContentView(binding.root)

        val transaction = supportFragmentManager.beginTransaction()

        transaction.add(R.id.fragment_container_view, LoginFragment(), "LoginFragment").commitAllowingStateLoss()
    }
}