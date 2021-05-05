package com.example.zham.repository

import com.example.zham.API.retrofitInstance
import com.example.zham.model.Login_schema
import com.example.zham.model.Signup_schema
import retrofit2.Response

class Repository {

    suspend fun pushPost(user: Login_schema) :Response<Login_schema>{
        return retrofitInstance.api.pushPost(user)
    }

    suspend fun Signup(user: Signup_schema) :Response<Signup_schema>{
        return retrofitInstance.api.Signup(user)
    }
}