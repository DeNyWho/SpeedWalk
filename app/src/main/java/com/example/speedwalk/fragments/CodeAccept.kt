package com.example.speedwalk.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.speedwalk.R
import com.example.speedwalk.data.Token
import com.example.speedwalk.model.Auth
import com.example.speedwalk.retrofit.ApiService
import com.example.speedwalk.retrofit.NetworkService
import com.example.speedwalk.viewModel.MainViewModel
import com.zjh.verification.VerificationCodeEditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CodeAccept : Fragment() {

    private lateinit var viewModel: MainViewModel
    val args: CodeAcceptArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_code_accept, container, false)
        val numberView = view.findViewById<TextView>(R.id.number)
        val code = view.findViewById<VerificationCodeEditText>(R.id.code)

        var textCode = ""

        code.setOnEditCompleteListener(object :
            VerificationCodeEditText.OnEditCompleteListener {
            override fun onEditComplete(text: String) {
                textCode = text
            }
        })

        val number = args.number
        numberView.text = number
        val next = view.findViewById<AppCompatButton>(R.id.next)
        next.setOnClickListener {
            if(textCode.isNotEmpty()) {
                val retroInstance = NetworkService.getRetroInstance().create(ApiService::class.java)
                val call = retroInstance.confirmPhone(number,textCode)
                call.enqueue(object : Callback<Auth> {
                    override fun onFailure(call: Call<Auth>, t: Throwable) {
                        Log.i("TAGER", t.message.toString())
                    }
                    override fun onResponse(call: Call<Auth>, response: Response<Auth>) {
                        val test = response.body()!!.encodedJwt
                        Log.e("ResponseBody", "$test")
                        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
                        viewModel.token.value = test
                        findNavController().navigate(R.id.action_codeAccept_to_page_reg)
                    }
                })
            }}
//        next.setOnClickListener { findNavController().navigate(R.id.action_codeAccept_to_page_reg) }


        return view
    }


}