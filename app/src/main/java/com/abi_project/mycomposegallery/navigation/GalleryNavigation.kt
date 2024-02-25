package com.abi_project.mycomposegallery.navigation

import android.widget.Gallery
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.abi_project.mycomposegallery.home.GalleryHomeScreen
import com.abi_project.mycomposegallery.splashscreen.GallerySplashScreen

@ExperimentalComposeUiApi
@Composable
fun  GalleryNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = GalleryScreens.SplashScreen.name
        ){

        composable(GalleryScreens.SplashScreen.name){
            GallerySplashScreen(navController = navController)
        }

        composable(GalleryScreens.HomeScreen.name){
            GalleryHomeScreen(navController = navController)
        }
    }
}