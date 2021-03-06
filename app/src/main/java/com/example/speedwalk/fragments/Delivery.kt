package com.example.speedwalk.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R


class Delivery : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_delivery, container, false)
        val back = view.findViewById<ImageView>(R.id.back)
        val menu = view.findViewById<ImageView>(R.id.menu)
        back.setOnClickListener { findNavController().navigate(R.id.action_delivery_to_backMenu) }
        menu.setOnClickListener { findNavController().navigate(R.id.action_delivery_to_menu) }

        return view
    }


}