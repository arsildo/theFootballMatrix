package com.arsildo.thefootballmatrix.logic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.arsildo.thefootballmatrix.presentation.ui.theme.TheFootballMatrixTheme

abstract class BaseComponent : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { TheFootballMatrixTheme { Content() } }
    }

    @Composable
    abstract fun Content()
}