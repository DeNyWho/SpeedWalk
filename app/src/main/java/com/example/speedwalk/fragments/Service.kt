package com.example.speedwalk.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R

class Service : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_service, container, false)

        val goBack = view.findViewById<ImageView>(R.id.go_back)
        val goMenu = view.findViewById<ImageView>(R.id.go_menu)
        goMenu.setOnClickListener { findNavController().navigate(R.id.action_service_to_menu) }
        goBack.setOnClickListener { findNavController().navigate(R.id.action_service_to_backMenu2) }
        return view
    }


}