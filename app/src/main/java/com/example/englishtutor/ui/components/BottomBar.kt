package com.example.englishtutor.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Face
import com.example.englishtutor.ui.navigation.AppDestination

@Composable
fun BottomBar(
    currentRoute: String?,
    onItemSelected: (String) -> Unit
) {
    NavigationBar {
        val items = listOf(
            AppDestination.Home to Icons.Filled.Home,
            AppDestination.Calculator to Icons.Filled.Face,
            AppDestination.About to Icons.Filled.Info,
            AppDestination.Edit to Icons.Filled.Edit
        )

        items.forEach { (destination, icon) ->
            NavigationBarItem(
                selected = currentRoute == destination.route,
                onClick = { onItemSelected(destination.route) },
                icon = { Icon(icon, contentDescription = destination.title) },
                label = { Text(destination.title) }
            )
        }
    }
}