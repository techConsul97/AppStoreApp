package com.sebqv97.myapplication.presentation.apps_list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
   CenterAlignedTopAppBar(
        title = { Text(text = "Aptoide", style = TextStyle(
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight(700),
            fontStyle = FontStyle.Italic
        ))},
        actions = {
           IconButton(onClick = { /*TODO*/ },) {
               Icon(imageVector = Icons.Outlined.AccountCircle,contentDescription = null)
               
           }
        }, modifier = Modifier.background(
            Brush.linearGradient(colors = listOf(Color(0xffEC6A23),Color(0xffA8440D))
        )
    ),
    colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color.Transparent)
    )

}


@Preview
@Composable
fun previewTopBar() {
    TopBar()

}