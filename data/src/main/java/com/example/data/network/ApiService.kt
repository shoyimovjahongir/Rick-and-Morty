package com.example.data.network

import com.example.domain.models2.UserData2
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

//    @GET("users")
    @GET("api/character")
//    @GET("service/v2/upcomingGuides")
//    @GET("service/v2/upcomingGuides/")
    suspend fun getUsers():Response<UserData2>
}