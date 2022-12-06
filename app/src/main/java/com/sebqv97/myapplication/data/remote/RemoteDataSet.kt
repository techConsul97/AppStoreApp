package com.sebqv97.myapplication.data.remote

import com.sebqv97.myapplication.domain.model.AppDetails
import com.sebqv97.myapplication.util.Resource
import kotlinx.coroutines.flow.Flow


interface RemoteDataSet {

   suspend fun getAppsInfo(): Flow<Resource<List<AppDetails>>>
}