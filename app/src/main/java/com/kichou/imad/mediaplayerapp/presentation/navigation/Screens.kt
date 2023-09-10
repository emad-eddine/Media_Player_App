package com.kichou.imad.mediaplayerapp.presentation.navigation

sealed class Screens (val route : String){

    object SplashScreen: Screens("splash_screen")

    object MainScreen: Screens("main_screen")

    object DetailScreen: Screens("detail_screen")

}
