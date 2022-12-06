package com.sebqv97.myapplication.presentation.apps_list

import com.sebqv97.myapplication.domain.model.AppDetails

data class AppsListState(
    val isLoading:Boolean = false,
    val error:String? = null,
    val editorPick:List<AppDetails> = emptyList(),
    val apps:List<AppDetails> = emptyList()
)
