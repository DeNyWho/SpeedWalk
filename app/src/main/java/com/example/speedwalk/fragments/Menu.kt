package com.example.speedwalk.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.speedwalk.R
import com.example.speedwalk.adapter.MenuAdapter
import com.example.speedwalk.data.ListCategories
import com.example.speedwalk.viewModel.MainViewModel


class Menu : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: MenuAdapter
    private lateinit var viewModel: MainViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)
        val cart = view.findViewById<ImageView>(R.id.cart)
        val nextMenu = view.findViewById<ImageView>(R.id.next_menu)
        recyclerView = view.findViewById(R.id.recycler)
        nextMenu.setOnClickListener { findNavController().navigate(R.id.action_menu_to_backMenu) }

        initViewModel()


        cart.setOnClickListener { findNavController().navigate(R.id.cart) }
        return view
    }

//    private fun getCategoryData(){
//        val retroInstance = NetworkService.getRetroInstance().create(ApiService::class.java)
//        Log.e("TOKENVALUE","${temp}")
//        val call = retroInstance.getCategories(1, token.value.toString())
//        call.enqueue(object : Callback<ListCategories> {
//            override fun onFailure(call: Call<ListCategories>, t: Throwable) {
//                recyclerListData.postValue(null)
//                Log.i("TAG", t.message.toString())
//            }
//            override fun onResponse(call: Call<ListCategories>, response: Response<ListCategories>) {
//                if (response.body() !=null){
//                    recyclerListData.postValue(response.body())
//
//                }else{
//                    recyclerListData.postValue(null)
//                    Log.d("TAG", response.raw().toString())
//                }
//            }
//        })
//    }

    private fun initRecyclerView(data: ListCategories){

        recyclerView.apply {
            recyclerView.layoutManager = GridLayoutManager(requireContext(),2)
            adapter = MenuAdapter(requireContext(),data)
            adapter = recyclerAdapter
        }
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        var f = ""
        viewModel.getTokenList().observe(viewLifecycleOwner){
            f = it
        }
        viewModel.getCategoryList().observe(viewLifecycleOwner) {
            if (it != null) {
                initRecyclerView(it)

            } else {
            }
        }
        viewModel.getCategoryData(f)
    }


}