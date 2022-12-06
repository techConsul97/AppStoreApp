package com.sebqv97.myapplication.di

import com.sebqv97.myapplication.data.remote.ApiService
import com.sebqv97.myapplication.data.remote.RemoteDataSet
import com.sebqv97.myapplication.data.remote.RemoteDataSetImpl
import com.sebqv97.myapplication.data.repository.AppsRepositoryImpl
import com.sebqv97.myapplication.domain.repository.AppsRepository
import com.sebqv97.myapplication.domain.use_case.GetAppsList
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object DomainModule {
    @Provides
    fun providesRemoteDataSet(apiService: ApiService):RemoteDataSet = RemoteDataSetImpl(apiService)

    @Provides
    fun providesAppsRepository(remoteDataSet: RemoteDataSet):AppsRepository = AppsRepositoryImpl(remoteDataSet)

    @Provides
    fun providesGetAppsListUseCase(repository: AppsRepository):GetAppsList= GetAppsList(repository)
}