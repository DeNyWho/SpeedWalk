package com.example.speedwalk.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R


class OrderOnClick : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_order_on_click, container, false)
        val back = view.findViewById<ImageView>(R.id.back)
        back.setOnClickListener { findNavController().navigate(R.id.action_orderOnClick_to_lastOrders) }

        val menu =view.findViewById<ImageView>(R.id.menu)
        menu.setOnClickListener { findNavController().navigate(R.id.action_orderOnClick_to_menu) }

        return view
    }

}