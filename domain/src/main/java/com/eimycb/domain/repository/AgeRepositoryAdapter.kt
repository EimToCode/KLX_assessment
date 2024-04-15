package com.eimycb.domain.repository

import com.eimycb.domain.ports.network.AgeNetworkPort
import com.eimycb.library.repository.AgeRepository

internal class AgeRepositoryAdapter(private val network: AgeNetworkPort): AgeRepository {
    override suspend fun getAge(name: String) = network.getAge(name)
}