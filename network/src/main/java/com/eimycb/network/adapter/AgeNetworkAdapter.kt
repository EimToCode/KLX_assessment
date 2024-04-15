package com.eimycb.network.adapter

import ErrorConverter
import com.eimycb.domain.ports.network.AgeNetworkPort
import com.eimycb.library.NetworkResponse
import com.eimycb.library.dto.Age
import com.eimycb.library.response
import com.eimycb.network.handleResponse
import com.eimycb.network.webServicce.AgeWebService

internal class AgeNetworkAdapter(
    private val webService: AgeWebService,
    private val errorConverter: ErrorConverter
) :
    AgeNetworkPort {
    override suspend fun getAge(name: String): NetworkResponse<Age> = response<Age> {
        webService.getAge(name).handleResponse(errorConverter, this) { succeeded(it) }
    }
}