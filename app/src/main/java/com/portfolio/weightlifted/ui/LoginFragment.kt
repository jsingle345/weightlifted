package com.portfolio.weightlifted.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.portfolio.weightlifted.R
import com.portfolio.weightlifted.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    lateinit var loginBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        loginBinding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return loginBinding.root
    }
}