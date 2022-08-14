package com.arsildo.thefootballmatrix.logic.navigation

sealed class Destinations(val route: String) {
    object Landing : Destinations(route = "landing_screen")
    object Preferences : Destinations(route = "preferences_screen")
}