package com.sebqv97.myapplication.data.repository

import com.sebqv97.myapplication.data.remote.RemoteDataSet
import com.sebqv97.myapplication.domain.model.AppDetails
import com.sebqv97.myapplication.domain.repository.AppsRepository
import com.sebqv97.myapplication.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AppsRepositoryImpl @Inject constructor(
    private val remoteDataSet: RemoteDataSet
): AppsRepository {
    override suspend fun getDataFromRemoteDataSource(): Flow<Resource<List<AppDetails>>> {
        return  remoteDataSet.getAppsInfo()
    }
}