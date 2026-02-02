package com.example.englishtutor.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.englishtutor.ui.screens.*

@Composable
fun AppNavGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navController,
        startDestination = AppDestination.Home.route
    ) {
        composable(AppDestination.Home.route) {
            HomeScreen(
                onCalculatorClick = {
                    navController.navigate(AppDestination.Calculator.route)
                },
                onAboutClick = {
                    navController.navigate(AppDestination.About.route)
                }
            )
        }

        composable(AppDestination.Calculator.route) {
            CalculatorScreen()
        }

        composable(AppDestination.About.route) {
            AboutScreen()
        }
    }
}