package com.example.englishtutor.ui.screens

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CalculatorViewModel : ViewModel() {

    private val _bdtInput = MutableStateFlow("")
    val bdtInput: StateFlow<String> = _bdtInput

    private val _usdResult = MutableStateFlow(0.0)
    val usdResult: StateFlow<Double> = _usdResult

    private val conversionRate = 0.0091

    fun onBdtChange(value: String) {
        _bdtInput.value = value.filter { it.isDigit() }
    }

    fun convert() {
        val bdt = _bdtInput.value.toDoubleOrNull() ?: 0.0
        _usdResult.value = bdt * conversionRate
    }
}
