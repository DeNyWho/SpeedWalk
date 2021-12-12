package com.example.speedwalk.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R
import com.yandex.runtime.image.Frame


class Menu : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)
        val cart = view.findViewById<ImageView>(R.id.cart)
        val one = view.findViewById<FrameLayout>(R.id.one)
        val two = view.findViewById<FrameLayout>(R.id.two)
        val three = view.findViewById<FrameLayout>(R.id.three)
        val four = view.findViewById<FrameLayout>(R.id.four)
        val five = view.findViewById<FrameLayout>(R.id.five)
        val six = view.findViewById<FrameLayout>(R.id.six)
        val seven = view.findViewById<FrameLayout>(R.id.seven)
        val eight = view.findViewById<FrameLayout>(R.id.eight)
        val nine = view.findViewById<FrameLayout>(R.id.nine)
        val ten = view.findViewById<FrameLayout>(R.id.ten)
        val eleven = view.findViewById<FrameLayout>(R.id.eleven)
        val twelve = view.findViewById<FrameLayout>(R.id.twelve)
        val nextMenu = view.findViewById<ImageView>(R.id.next_menu)
        nextMenu.setOnClickListener { findNavController().navigate(R.id.action_menu_to_backMenu) }



        one.setOnClickListener { findNavController().navigate(R.id.action_menu_to_onItem) }
        two.setOnClickListener { findNavController().navigate(R.id.action_menu_to_onItem) }
        three.setOnClickListener { findNavController().navigate(R.id.action_menu_to_onItem) }
        four.setOnClickListener { findNavController().navigate(R.id.action_menu_to_onItem) }
        five.setOnClickListener { findNavController().navigate(R.id.action_menu_to_onItem) }
        six.setOnClickListener { findNavController().navigate(R.id.action_menu_to_onItem) }
        seven.setOnClickListener { findNavController().navigate(R.id.action_menu_to_onItem) }
        eight.setOnClickListener { findNavController().navigate(R.id.action_menu_to_onItem) }
        nine.setOnClickListener { findNavController().navigate(R.id.action_menu_to_onItem) }
        ten.setOnClickListener { findNavController().navigate(R.id.action_menu_to_onItem) }
        eleven.setOnClickListener { findNavController().navigate(R.id.action_menu_to_onItem) }
        twelve.setOnClickListener { findNavController().navigate(R.id.action_menu_to_onItem) }

        cart.setOnClickListener { findNavController().navigate(R.id.action_menu_to_cart) }
        return view
    }


}