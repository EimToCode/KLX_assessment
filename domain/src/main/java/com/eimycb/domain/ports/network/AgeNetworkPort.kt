package com.eimycb.domain.ports.network

import com.eimycb.library.NetworkResponse
import com.eimycb.library.dto.Age

interface AgeNetworkPort {

    suspend fun getAge(name: String): NetworkResponse<Age>
}