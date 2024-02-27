package com.abi_project.mycomposegallery.navigation

import java.lang.IllegalArgumentException

enum class GalleryScreens {
    SplashScreen,
    AtomScreen,
    HomeScreen;
    companion object {
        fun fromRouter(route: String? ) : GalleryScreens =
            when(route?.substringBefore("/")){
                SplashScreen.name -> SplashScreen
                HomeScreen.name -> HomeScreen
                AtomScreen.name -> AtomScreen
                else -> throw IllegalArgumentException("Route $route is not recognized")
            }
    }
}