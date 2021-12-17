package com.example.speedwalk.retrofit

import com.example.speedwalk.data.ListCategories
import com.example.speedwalk.model.Auth
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @POST("login/client")
    @FormUrlEncoded
    suspend fun clientLogin(@Field("phone") phone: String)

    @POST("login/clientPhoneConfirm")
    @FormUrlEncoded
    fun confirmPhone(@Field("phone") phone: String, @Field("SmsCode") smsCode: String): Call<Auth>

    @GET("categories/getCategoriesInShop")
    fun getCategories(@Query("shopId")shopId: Int, @Header("jwt") jwt: String): Call<ListCategories>


}