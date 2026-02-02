package com.example.englishtutor.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.englishtutor.ui.navigation.AppDestination

@Composable
fun AppDrawer(
    onDestinationClicked: (String) -> Unit
) {
    ModalDrawerSheet {
        Text(
            text = "English Tutor",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(16.dp)
        )

        Divider()

        DrawerItem("Home") {
            onDestinationClicked(AppDestination.Home.route)
        }
        DrawerItem("Calculator") {
            onDestinationClicked(AppDestination.Calculator.route)
        }
        DrawerItem("About") {
            onDestinationClicked(AppDestination.About.route)
        }
    }
}

@Composable
private fun DrawerItem(
    text: String,
    onClick: () -> Unit
) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(16.dp),
        style = MaterialTheme.typography.bodyLarge
    )
}
