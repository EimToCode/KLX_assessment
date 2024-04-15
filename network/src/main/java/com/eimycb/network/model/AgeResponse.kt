package com.eimycb.network.model

import com.eimycb.library.dto.Age
import com.google.gson.annotations.SerializedName

data class AgeResponse(
    @SerializedName("count")
    override val count: Int,
    @SerializedName("name")
    override val name: String,
    @SerializedName("age")
    override val age: Int
): Age
