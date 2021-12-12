package com.example.speedwalk.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R


class Support : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_support, container, false)

        val back = view.findViewById<ImageView>(R.id.back)
        val menu = view.findViewById<ImageView>(R.id.menu)
        back.setOnClickListener { findNavController().navigate(R.id.action_support_to_backMenu) }
        menu.setOnClickListener { findNavController().navigate(R.id.action_support_to_menu) }
        return view
    }


}