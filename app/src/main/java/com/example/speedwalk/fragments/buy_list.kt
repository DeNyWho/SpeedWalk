package com.example.speedwalk.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R

class buy_list : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_buy_list, container, false)
        val next = view.findViewById<AppCompatButton>(R.id.next)
        val back = view.findViewById<ImageView>(R.id.back)
        next.setOnClickListener { findNavController().navigate(R.id.action_buy_list_to_buyCard) }
        back.setOnClickListener { findNavController().navigate(R.id.action_buy_list_to_cart) }
        val card = view.findViewById<FrameLayout>(R.id.card)
        val nal = view.findViewById<FrameLayout>(R.id.nal)

        card.setOnClickListener {
            card.setBackgroundResource(R.drawable.back_buy_in)
            nal.setBackgroundResource(R.drawable.back_buy_off)
        }
        nal.setOnClickListener {
            card.setBackgroundResource(R.drawable.back_buy_off)
            nal.setBackgroundResource(R.drawable.back_buy_in)
        }



        return view
    }


}