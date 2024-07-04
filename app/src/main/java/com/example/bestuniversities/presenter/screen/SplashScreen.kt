package com.example.bestuniversities.presenter.screen

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bestuniversities.R
import com.example.bestuniversities.databinding.ScreenSplashBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashScreen:Fragment(R.layout.screen_splash) {
    private val binding by viewBinding(ScreenSplashBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val animationView = binding.animationView
        animationView.setAnimation("splash.json")
        animationView.playAnimation()

        Handler().postDelayed({
            findNavController().navigate(SplashScreenDirections.actionSplashScreenToUniversitiesScreen())
        }, 1500)
    }
}