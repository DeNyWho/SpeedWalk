package com.example.speedwalk.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R

class BuyCard : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_buy_card, container, false)
        val next = view.findViewById<AppCompatButton>(R.id.next)
        val back = view.findViewById<ImageView>(R.id.back)
        back.setOnClickListener { findNavController().navigate(R.id.action_buyCard_to_buy_list) }
        next.setOnClickListener { findNavController().navigate(R.id.action_buyCard_to_order_done) }
        return view
    }


}