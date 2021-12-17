package com.example.speedwalk.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import br.com.sapereaude.maskedEditText.MaskedEditText
import com.example.speedwalk.R
import com.example.speedwalk.retrofit.NetworkService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NumberPhone : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_number_phone, container, false)
        val next = view.findViewById<AppCompatButton>(R.id.next)
        val text = view.findViewById<MaskedEditText>(R.id.phone)

        next.setOnClickListener {
            if(text.text!!.isNotEmpty()) {
                val phone = text.text.toString()
                val c = "()-"
                val p = phone.replace(Regex("[$c]"), "")
                CoroutineScope(Dispatchers.IO).launch {

                    val response = NetworkService.api().clientLogin(p)
                    withContext(Dispatchers.Main){
                        val action = NumberPhoneDirections.actionNumberPhone2ToCodeAccept(p)
                        Navigation.findNavController(view).navigate(action)
                    }

                }
            }}

        return view
    }

}