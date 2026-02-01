package com.example.englishtutor.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import androidx.navigation.NavHostController
import com.example.englishtutor.ui.screens.*

@Composable
fun NavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    NavHost(
        navController = navController,
        startDestination = "home",
                modifier = modifier
    ) {
        composable("home") {
            HomeScreen(
                onNavigateCalculator = {
                    navController.navigate("calculator")
                }
            )
        }
        composable("calculator") {
            CalculatorScreen()
        }
        composable("about") {
            AboutScreen()
        }
    }
}
