package com.example.speedwalk.fragments

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R


class onItem : Fragment() {

    private var key = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_on_item, container, false)
        val back =view.findViewById<ImageView>(R.id.go_back)
        back.setOnClickListener { findNavController().navigate(R.id.action_onItem_to_menu) }

        val one = view.findViewById<FrameLayout>(R.id.one)
        val two = view.findViewById<FrameLayout>(R.id.two)
        val three =view.findViewById<FrameLayout>(R.id.three)
        val four = view.findViewById<FrameLayout>(R.id.four)

        one.setOnClickListener { showDialog(this) }
        two.setOnClickListener { showDialog(this) }
        three.setOnClickListener { showDialog(this) }
        four.setOnClickListener { showDialog(this) }

        val first = view.findViewById<FrameLayout>(R.id.first)
        val second = view.findViewById<FrameLayout>(R.id.second)
        val third = view.findViewById<FrameLayout>(R.id.third)
        val fourth = view.findViewById<FrameLayout>(R.id.fourth)

        first.setOnClickListener { showDialog(this) }
        second.setOnClickListener { showDialog(this) }
        third.setOnClickListener { showDialog(this) }
        fourth.setOnClickListener { showDialog(this) }

        return view
    }

    private fun showDialog(onItem: Fragment) {
        var count = 1
        val dialog = Dialog(requireContext())
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.bottom_sheet)
        dialog.window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        val cart = dialog.findViewById<AppCompatButton>(R.id.cart)
        val minus = dialog.findViewById<AppCompatButton>(R.id.minus)
        val plus = dialog.findViewById<AppCompatButton>(R.id.plus)
        val text = dialog.findViewById<TextView>(R.id.text)
        minus.setOnClickListener {
            count--
            text.text = "$count шт"
        }
        plus.setOnClickListener {
            count++
            text.text = "$count шт"
        }
        cart.setOnClickListener {
            dialog.dismiss()
            findNavController().navigate(R.id.action_onItem_to_cart3)
        }
        if(key>0) {
            dialog.dismiss()
            findNavController().navigate(R.id.action_onItem_to_cart3)
        }
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window!!.attributes.windowAnimations = R.style.DialogAnimation
        dialog.window!!.setGravity(Gravity.BOTTOM)

        dialog.show()
    }


}