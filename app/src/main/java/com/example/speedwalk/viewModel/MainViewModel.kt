package com.example.speedwalk.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.speedwalk.data.ListCategories
import com.example.speedwalk.retrofit.ApiService
import com.example.speedwalk.retrofit.NetworkService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainViewModel: ViewModel() {
    var token: MutableLiveData<String> =  MutableLiveData<String>()

    fun getTokenList(): MutableLiveData<String>
    {
        return token
    }
    var  recyclerListData: MutableLiveData<ListCategories> = MutableLiveData()

    fun getCategoryList(): MutableLiveData<ListCategories>
    {
        return recyclerListData
    }


    // Retrofit response
    fun getCategoryData(f: String) {
        Log.d("TOKENVALUE", f)
        Log.e("TOKENVALUE", f)
        val retroInstance = NetworkService.getRetroInstance().create(ApiService::class.java)
        val call = retroInstance.getCategories(1, f)
        call.enqueue(object : Callback<ListCategories> {
            override fun onFailure(call: Call<ListCategories>, t: Throwable) {
                recyclerListData.postValue(null)
                Log.i("TAG", t.message.toString())
            }
            override fun onResponse(call: Call<ListCategories>, response: Response<ListCategories>) {
                if (response.body() !=null){
                    recyclerListData.postValue(response.body())

                }else{
                    recyclerListData.postValue(null)
                    Log.d("TAG", response.raw().toString())
                }
            }
        })
    }
}