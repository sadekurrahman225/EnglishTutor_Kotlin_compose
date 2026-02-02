package com.example.englishtutor.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CalculatorScreen() {

    // UI state (lives in the screen)
    var bdtAmount by remember { mutableStateOf("") }
    var usdResult by remember { mutableStateOf("") }

    val exchangeRate = 110.0

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "BDT to USD",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = bdtAmount,
            onValueChange = { bdtAmount = it },
            label = { Text("Enter amount in BDT") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val bdt = bdtAmount.toDoubleOrNull()
                usdResult = if (bdt != null) {
                    String.format("%.2f USD", bdt / exchangeRate)
                } else {
                    "Invalid amount"
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Convert")
        }

        Spacer(modifier = Modifier.height(24.dp))

        if (usdResult.isNotEmpty()) {
            Text(
                text = usdResult,
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}
