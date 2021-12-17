package com.example.speedwalk.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R


class order_done : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_order_done, container, false)
        val next = view.findViewById<AppCompatButton>(R.id.next)
        val back = view.findViewById<ImageView>(R.id.back)
        back.setOnClickListener { findNavController().navigate(R.id.action_order_done_to_menu) }
        next.setOnClickListener { findNavController().navigate(R.id.action_order_done_to_mapOrder) }
        return view
    }


}