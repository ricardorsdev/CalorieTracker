package com.plcoding.calorytracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.core.navigation.Route
import com.example.onboarding_presentation.welcome.WelcomeScreen
import com.plcoding.calorytracker.navigation.navigate
import com.plcoding.calorytracker.ui.theme.CaloryTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaloryTrackerTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Route.WELCOME
                ) {
                    composable(Route.WELCOME) {
                        WelcomeScreen(onNavigate = navController::navigate)
                    }
                    composable(Route.AGE) {
                        /*TODO*/
                    }
                    composable(Route.GENDER) {
                        /*TODO*/
                    }
                    composable(Route.HEIGHT) {
                        /*TODO*/
                    }
                    composable(Route.WEIGHT) {
                        /*TODO*/
                    }
                    composable(Route.NUTRIENT_GOAL) {
                        /*TODO*/
                    }
                    composable(Route.ACTIVITY) {
                        /*TODO*/
                    }
                    composable(Route.GOAL) {
                        /*TODO*/
                    }
                    composable(Route.TRACKER_OVERVIEW) {
                        /*TODO*/
                    }
                    composable(Route.SEARCH) {
                        /*TODO*/
                    }
                }
            }
        }
    }
}