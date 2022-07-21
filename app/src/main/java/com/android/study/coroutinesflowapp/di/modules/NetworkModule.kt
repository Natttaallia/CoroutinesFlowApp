package com.android.study.coroutinesflowapp.di.modules

import com.android.study.coroutinesflowapp.api.ApiService
import com.android.study.coroutinesflowapp.di.annotations.Monsters
import com.android.study.coroutinesflowapp.di.annotations.Spells
import dagger.Module
import dagger.Provides

/**
 * @author Kulbaka Nataly
 * @date 20.07.2022
 */
@Module
class NetworkModule {

    @Spells
    @Provides
    fun provideSpellsService(): ApiService {
        return ApiService.provideService(ApiService.provideRetrofit())
    }

    @Monsters
    @Provides
    fun provideMonstersService(): ApiService {
        return ApiService.provideService(ApiService.provideRetrofit())
    }
}