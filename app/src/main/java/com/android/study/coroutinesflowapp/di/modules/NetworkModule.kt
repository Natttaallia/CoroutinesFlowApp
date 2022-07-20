package com.android.study.coroutinesflowapp.di.modules

import com.android.study.coroutinesflowapp.api.ApiService
import dagger.Module
import dagger.Provides

/**
 * @author Kulbaka Nataly
 * @date 20.07.2022
 */
@Module
class NetworkModule {

    @Provides
    fun provideService(): ApiService {
        return ApiService.provideService(ApiService.provideRetrofit())
    }
}