package com.example.zham.model

import com.google.gson.annotations.SerializedName

data class Login_schema (
    @SerializedName("Email")
    var email: String = "" ,
    @SerializedName("Password")
    var password:String = ""
)