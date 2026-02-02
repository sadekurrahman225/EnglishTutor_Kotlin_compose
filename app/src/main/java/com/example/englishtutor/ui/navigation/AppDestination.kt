package com.example.englishtutor.ui.navigation

sealed class AppDestination(val route: String, val title: String) {
    object Home : AppDestination("home", "Home")
    object Calculator : AppDestination("calculator", "Calculator")
    object About : AppDestination("about", "About")
    object Edit : AppDestination("edit", "Edit")
}
