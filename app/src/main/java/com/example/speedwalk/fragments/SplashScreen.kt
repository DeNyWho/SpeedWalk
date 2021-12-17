package com.example.speedwalk.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.postDelayed
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R


@SuppressLint("CustomSplashScreen")
class SplashScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val handler = Handler()
        handler.postDelayed(2500){
            findNavController().navigate(R.id.action_splashScreen_to_numberPhone2)
        }

        val view = inflater.inflate(R.layout.fragment_splash_screen, container, false)

        return view
    }


}