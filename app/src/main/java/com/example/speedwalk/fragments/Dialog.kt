package com.example.speedwalk.fragments

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R

class Dialog : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dialog, container, false)
        showDialog()
        return view
    }

    private fun showDialog() {
        findNavController().navigate(R.id.action_onItem_to_dialog)
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
        cart.setOnClickListener { findNavController().navigate(R.id.action_onItem_to_cart2) }
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window!!.attributes.windowAnimations = R.style.DialogAnimation
        dialog.window!!.setGravity(Gravity.BOTTOM)

        dialog.show()
    }


}