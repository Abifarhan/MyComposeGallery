package com.abi_project.mycomposegallery.splashscreen

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import com.abi_project.mycomposegallery.navigation.GalleryScreens
import kotlinx.coroutines.delay


@Composable
fun GallerySplashScreen(navController: NavController) {

    val scale = remember {
        androidx.compose.animation.core.Animatable(0f)
    }

    LaunchedEffect(key1 = true){
        scale.animateTo(targetValue = 0.9f,
            animationSpec = tween(durationMillis = 800,
                easing = {
                    OvershootInterpolator(8f)
                        .getInterpolation(it)
                }
                )
            )
        delay(2000L)

        navController.navigate(GalleryScreens.HomeScreen.name)
    }
}