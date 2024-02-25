package com.abi_project.mycomposegallery.navigation

import java.lang.IllegalArgumentException

enum class GalleryScreens {
    SplashScreen,
    HomeScreen;
    companion object {
        fun fromRouter(route: String? ) : GalleryScreens =
            when(route?.substringBefore("/")){
                SplashScreen.name -> SplashScreen
                HomeScreen.name -> HomeScreen
                else -> throw IllegalArgumentException("Route $route is not recognized")
            }
    }
}