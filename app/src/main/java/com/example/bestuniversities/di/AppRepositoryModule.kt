package com.example.bestuniversities.di

import com.example.bestuniversities.domain.AppRepository
import com.example.bestuniversities.domain.AppRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface AppRepositoryModule {

    @Binds
    fun getAppRepository(impl: AppRepositoryImpl) : AppRepository
}
