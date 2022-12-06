package com.sebqv97.myapplication.presentation.apps_list

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.sebqv97.myapplication.presentation.apps_list.components.EditorsPickSection
import com.sebqv97.myapplication.presentation.apps_list.components.TopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(viewModel: AppsListViewModel = hiltViewModel(), modifier: Modifier = Modifier) {
    val state by viewModel.appsListState
    Scaffold(topBar = { TopBar() }) {

        Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            EditorsPickSection()
        }
    }
}
