package com.example.domain.repository

import com.example.domain.models2.UserData2
import kotlinx.coroutines.flow.Flow
import retrofit2.Response


interface UserRepository {

    fun getUser(): Flow<Response<UserData2>>
}