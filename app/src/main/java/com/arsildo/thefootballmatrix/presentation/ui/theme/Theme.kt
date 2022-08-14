package com.arsildo.thefootballmatrix.presentation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkTheme = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightTheme = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = White
)

@Composable
fun TheFootballMatrixTheme(content: @Composable () -> Unit) {
    val systemUIController = rememberSystemUiController()
    systemUIController.setStatusBarColor(LightTheme.background)
    systemUIController.setNavigationBarColor(LightTheme.background)
    MaterialTheme(
        colors = LightTheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}