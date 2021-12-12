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


class page_reg : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_page_reg, container, false)

        val next = view.findViewById<ImageView>(R.id.next)
        next.setOnClickListener { findNavController().navigate(R.id.action_page_reg_to_menu) }
        val one = view.findViewById<AppCompatButton>(R.id.one)
        val two = view.findViewById<AppCompatButton>(R.id.two)
        val three = view.findViewById<AppCompatButton>(R.id.three)


        one.setOnClickListener {
            one.setBackgroundResource(R.drawable.pres)
            two.setBackgroundResource(R.drawable.back_upres)
            three.setBackgroundResource(R.drawable.back_upres)
        }
        two.setOnClickListener {
            one.setBackgroundResource(R.drawable.back_upres)
            two.setBackgroundResource(R.drawable.pres)
            three.setBackgroundResource(R.drawable.back_upres)
        }
        three.setOnClickListener {
            one.setBackgroundResource(R.drawable.back_upres)
            two.setBackgroundResource(R.drawable.back_upres)
            three.setBackgroundResource(R.drawable.pres)
        }
        return view
    }


}