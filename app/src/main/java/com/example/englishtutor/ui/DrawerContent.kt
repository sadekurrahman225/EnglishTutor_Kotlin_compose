package com.example.englishtutor.ui

import androidx.compose.foundation.background
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DrawerContent(
    selectedItem: String,
    onItemSelected: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(0.5f) // 👈 half of the screen
            .background(Color.White) // 👈 white background
            .padding(16.dp)

    ) {

        Text(
            text = "English Tutor",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(24.dp))

        NavigationDrawerItem(
            label = { Text("BDT → USDD") },
            selected = selectedItem == "calculator",
            onClick = { onItemSelected("calculator") }
        )

        NavigationDrawerItem(
            label = { Text("Home") },
            selected = selectedItem == "home",
            onClick = { onItemSelected("home") }
        )



        NavigationDrawerItem(
            label = { Text("About") },
            selected = selectedItem == "about",
            onClick = { onItemSelected("about") }
        )
    }
}
