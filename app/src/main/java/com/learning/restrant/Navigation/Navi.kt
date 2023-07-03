package com.learning.restrant.Navigation

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.learning.restrant.Screens.*

@Composable
fun Navi() {
    val navController = rememberNavController()

        NavHost(navController = navController , startDestination = "Home") {
            composable("Home") {
                           Home()
            }
            composable("Notification") {
                    Notifications()
            }
            composable("Cart") {
                    Cart()
            }
            composable("Login") {
                Login()
            }
            composable("SignUp") {
                SignUp()
            }
            composable("Recover") {
                Recover()
            }
            composable("Order") {
                Order()
            }
    }
}

@Composable
fun bottombar(){
    val navController = rememberNavController()
    val selectedIndex = remember {
        mutableStateOf(0)
    }
    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(
            selected = (selectedIndex.value == 0),
            onClick = {
                selectedIndex.value = 0

                      },
            icon = { Icon(imageVector = Icons.Rounded.Home, contentDescription = "Home")},
            label = {}
        )
        BottomNavigationItem(
            selected = (selectedIndex.value == 1),
            onClick = {
                selectedIndex.value = 1

                      },
            icon = { Icon(imageVector = Icons.Rounded.Notifications, contentDescription = "Notifications")},
            label = {}
        )
        BottomNavigationItem(
            selected = (selectedIndex.value == 2),
            onClick = {
                selectedIndex.value = 2

                      },
            icon = { Icon(imageVector = Icons.Rounded.ShoppingCart, contentDescription = "Cart")},
            label = {}
        )
        BottomNavigationItem(
            selected = (selectedIndex.value == 3),
            onClick = {
                selectedIndex.value = 3

                      },
            icon = { Icon(imageVector = Icons.Rounded.Person, contentDescription = "Profile")},
            label = {}
        )
    }
}
