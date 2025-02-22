package com.example.myapplication.presentation

import com.example.myapplication.domain.Currency

data class ExchangeState(
    val from: Currency = Currency("United States Dollar", "USD"),
    val to: Currency = Currency("Euro", "EUR"),
    val amount: String = "1",
    val result: String = "",
    val allCurrencies: List<Currency> = emptyList()
)
