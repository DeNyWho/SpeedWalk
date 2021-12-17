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

class LastOrders : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_last_orders, container, false)
        val firstItem = view.findViewById<FrameLayout>(R.id.go_itemone)
        val secondItem = view.findViewById<FrameLayout>(R.id.go_itemtwo)
        val thirdItem = view.findViewById<FrameLayout>(R.id.go_itemthree)
        val fourItem = view.findViewById<FrameLayout>(R.id.go_itemfour)
        val goMenu = view.findViewById<ImageView>(R.id.go_menu)
        val goBack = view.findViewById<ImageView>(R.id.back)
        goMenu.setOnClickListener { findNavController().navigate(R.id.action_lastOrders_to_menu) }
        goBack.setOnClickListener { findNavController().navigate(R.id.action_lastOrders_to_backMenu) }


        firstItem.setOnClickListener { findNavController().navigate(R.id.action_lastOrders_to_orderOnClick) }
        secondItem.setOnClickListener { findNavController().navigate(R.id.action_lastOrders_to_orderOnClick) }
        thirdItem.setOnClickListener { findNavController().navigate(R.id.action_lastOrders_to_orderOnClick) }
        fourItem.setOnClickListener { findNavController().navigate(R.id.action_lastOrders_to_orderOnClick) }



        return view
    }


}