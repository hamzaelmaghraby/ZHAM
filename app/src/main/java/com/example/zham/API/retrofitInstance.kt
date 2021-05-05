package com.example.zham.API

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object retrofitInstance {
    var gson = GsonBuilder()
        .setLenient()
        .create()
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("http://192.168.1.138:3000")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

    }
    val api : simpleAPI by lazy {
            retrofit.create(simpleAPI::class.java)
    }
}