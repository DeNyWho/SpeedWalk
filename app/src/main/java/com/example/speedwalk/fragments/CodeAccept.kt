package com.example.speedwalk.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController
import com.example.speedwalk.R

class CodeAccept : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_code_accept, container, false)
        val next = view.findViewById<AppCompatButton>(R.id.next)
        next.setOnClickListener { findNavController().navigate(R.id.action_codeAccept_to_page_reg) }


        return view
    }


}