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
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(Modifier.height(32.dp))

        Text(
            text = "English Tutor",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary
        )

        Text(
            text = "Learn English easily",
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(Modifier.height(48.dp))

        Button(
            onClick = onCalculatorClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("BDT → USD Calculator")
        }

        Spacer(Modifier.height(16.dp))

        OutlinedButton(
            onClick = onAboutClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("About App")
        }
    }
}
