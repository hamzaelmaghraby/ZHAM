package com.example.zham.model

import com.google.gson.annotations.SerializedName

data class Signup_schema (
    @SerializedName("Firstname")
    var Firstname: String ="" ,
    @SerializedName("Middlename")
    var middle_name: String ="" ,
    @SerializedName("Lastname")
    var last_name: String = "" ,
    @SerializedName("Email")
    var email: String = "" ,
    @SerializedName("Password")
    var password:String = "" ,
    @SerializedName("Phone")
    var phone_number: Int = 0 ,
    @SerializedName("Birthdate")
    var birth_date: String = "" ,
    @SerializedName("Gender")
    var gender: String = "" ,
    @SerializedName("CardNumber")
    var card_number: String = "",
    @SerializedName("State")
    var state: Boolean
)