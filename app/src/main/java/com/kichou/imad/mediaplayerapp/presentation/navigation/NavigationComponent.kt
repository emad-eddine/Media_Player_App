package com.kichou.imad.mediaplayerapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kichou.imad.mediaplayerapp.presentation.screens.splash_screen.SplashScreen


@Composable
fun Navigation() {


    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.SplashScreen.route){

        composable(route = Screens.SplashScreen.route){
            SplashScreen(navController = navController)
        }

        composable(route = Screens.MainScreen.route){

        }

        composable(route = Screens.DetailScreen.route){

        }


    }

}