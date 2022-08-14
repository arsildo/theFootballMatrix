package com.arsildo.thefootballmatrix.presentation.activities

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arsildo.thefootballmatrix.logic.BaseComponent
import com.arsildo.thefootballmatrix.logic.navigation.Destinations
import com.arsildo.thefootballmatrix.presentation.screens.LandingScreen

class MainActivity : BaseComponent() {

    private lateinit var navigationController: NavHostController

    @Composable
    override fun Content() {
        navigationController = rememberNavController()
        NavigationComponent(navigationController = navigationController)
    }

    @Composable
    fun NavigationComponent(navigationController: NavHostController) {
        NavHost(
            navController = navigationController,
            startDestination = Destinations.Landing.route
        ) {
            composable(Destinations.Landing.route) { LandingScreen() }
        }
    }

}