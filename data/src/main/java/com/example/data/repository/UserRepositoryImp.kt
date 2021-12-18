package com.example.data.repository

import com.example.data.network.ApiService
import com.example.domain.models2.UserData2
import com.example.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

class UserRepositoryImp @Inject constructor(private val apiService: ApiService) : UserRepository {
    override fun getUser(): Flow<Response<UserData2>> {
        return flow { emit(apiService.getUsers()) }
    }

}