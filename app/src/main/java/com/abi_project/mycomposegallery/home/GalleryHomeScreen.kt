package com.abi_project.mycomposegallery.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.abi_project.mycomposegallery.navigation.GalleryScreens


@Composable
fun GalleryHomeScreen(navController: NavController) {

    Column {

        Text(
            text = "Atoms",
            overflow = TextOverflow.Clip,
            fontStyle = FontStyle.Italic,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .clickable {
                    // onClick logic here
                    // For example, you can navigate to a different screen
                    navController.navigate(GalleryScreens.AtomScreen.name)
                }
        )


        Text(text =  "Molecule",
            overflow = TextOverflow.Clip,
            fontStyle = FontStyle.Italic,
            style = MaterialTheme.typography.titleMedium
            ,
            modifier = Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .clickable {
                    // onClick logic here
                    // For example, you can navigate to a different screen
//                    navController.navigate("destination")
                }
        )


        Text(text =  "Template",
            overflow = TextOverflow.Clip,
            fontStyle = FontStyle.Italic,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .clickable {
                    // onClick logic here
                    // For example, you can navigate to a different screen
//                    navController.navigate("destination")
                })


    }
}