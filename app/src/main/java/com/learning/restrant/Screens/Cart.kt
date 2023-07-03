package com.learning.restrant.Screens

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.learning.restrant.Navigation.bottombar

@Composable
fun Cart(){
    Scaffold(
            topBar = {
                topappbar()
            },
            backgroundColor = if (isSystemInDarkTheme()) Color.DarkGray else Color.LightGray,
            bottomBar = {
                 bottombar()
            }
        ) {

        Text(text = "Cart")
    }
}