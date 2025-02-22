package com.example.myapplication.data

import kotlinx.serialization.Serializable

@Serializable

data class ExchangeDto(
    val conversion_result: Double

)