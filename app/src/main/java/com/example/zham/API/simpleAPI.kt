package com.example.zham.API

import com.example.zham.model.Login_schema
import com.example.zham.model.Signup_schema
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface simpleAPI {




    @POST("/Login")
    suspend fun pushPost(
            @Body Post: Login_schema
    ): Response<Login_schema>


    @POST("/register")
    suspend fun Signup(
        @Body Post: Signup_schema
    ): Response<Signup_schema>
}