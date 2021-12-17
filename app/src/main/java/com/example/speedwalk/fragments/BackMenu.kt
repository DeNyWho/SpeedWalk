package com.example.speedwalk.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R


class BackMenu : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_back_menu, container, false)

        val delivery = view.findViewById<FrameLayout>(R.id.delivery)
        val service = view.findViewById<FrameLayout>(R.id.service)
        val support = view.findViewById<FrameLayout>(R.id.support)
        val lastOrders = view.findViewById<FrameLayout>(R.id.lastOrders)
        val cart = view.findViewById<ImageView>(R.id.cart)

        delivery.setOnClickListener { findNavController().navigate(R.id.action_backMenu_to_delivery) }
        service.setOnClickListener { findNavController().navigate(R.id.action_backMenu_to_service) }
        support.setOnClickListener { findNavController().navigate(R.id.action_backMenu_to_support) }
        lastOrders.setOnClickListener { findNavController().navigate(R.id.action_backMenu_to_lastOrders) }
        cart.setOnClickListener { findNavController().navigate(R.id.action_backMenu_to_cart) }

        return view
    }


}