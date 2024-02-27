package com.abi_project.mycomposegallery.atoms.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun AtomsScreens(navController: NavHostController? = null) {
    Surface(color = MaterialTheme.colorScheme.background) {

    Column(modifier = Modifier.padding(5.dp),
        verticalArrangement = Arrangement.Top,
//        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = "You are in Atom Page",
            style = typography.headlineLarge,
            color = colorScheme.primary,
//            modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        
        CustomText(insertText = "Hello there")
    }
    }
}


@Composable
fun CustomText(insertText: String = "") {

    var textValue by remember { mutableStateOf(TextFieldValue()) }
    
    Text(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),

        text = insertText

    )
}