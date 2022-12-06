package com.sebqv97.myapplication.domain.repository

import com.sebqv97.myapplication.domain.model.AppDetails
import com.sebqv97.myapplication.util.Resource
import kotlinx.coroutines.flow.Flow

interface AppsRepository {

 suspend fun getDataFromRemoteDataSource() : Flow<Resource<List<AppDetails>>>
}