package com.example.speedwalk.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

private const val baseURL = "http://megacy1-001-site1.etempurl.com/api/"

class NetworkService {


    companion object {

        fun api(): ApiService {
            return Retrofit.Builder()

                .baseUrl(baseURL)
                .addConverterFactory(MoshiConverterFactory.create().asLenient())
                .build()
                .create(ApiService::class.java)
        }
        fun getRetroInstance(): Retrofit{
            return Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        fun instance(): Retrofit{
            return Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}