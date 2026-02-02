package com.example.englishtutor.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onCalculatorClick: () -> Unit,
    onAboutClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("English Tutor", style = MaterialTheme.typography.headlineLarge)

        Spacer(Modifier.height(24.dp))

        Button(onClick = onCalculatorClick) {
            Text("BDT to USD Calculator")
        }

        Spacer(Modifier.height(12.dp))

        OutlinedButton(onClick = onAboutClick) {
            Text("About")
        }
    }
}
