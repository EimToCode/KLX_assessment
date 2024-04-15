package com.eimycb.network.webServicce

import com.eimycb.library.dto.Age
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface AgeWebService {
    @GET("?name={name}")
    suspend fun getAge(@Path("name") name: String): Response<Age>

}