package com.eimycb.library.repository

import com.eimycb.library.NetworkResponse
import com.eimycb.library.dto.Age

interface AgeRepository {
    suspend fun getAge(name: String): NetworkResponse<Age>
}