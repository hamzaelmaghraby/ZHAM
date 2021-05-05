package com.example.zham

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.zham.model.Login_schema
import com.example.zham.model.Signup_schema
import com.example.zham.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository) : ViewModel() {
    val myresponse : MutableLiveData<Response<Login_schema>> = MutableLiveData()
    val myresponse2 : MutableLiveData<Response<Signup_schema>> = MutableLiveData()

    fun pushPost(user: Login_schema){
        viewModelScope.launch {
            val response = repository.pushPost(user)
            myresponse.value = response
        }
    }

    fun Signup(user: Signup_schema){
        viewModelScope.launch {
            val response = repository.Signup(user)
            myresponse2.value = response
        }
    }
}