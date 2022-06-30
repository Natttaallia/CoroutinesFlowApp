package com.android.study.coroutinesflowapp.di

import com.android.study.coroutinesflowapp.api.ApiService
import com.android.study.coroutinesflowapp.api.ApiService.Companion.provideRetrofit
import com.android.study.coroutinesflowapp.api.ApiService.Companion.provideService
import org.koin.dsl.module

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
val networkModule = module {
    single { provideRetrofit() }
    single { provideService<ApiService>(get()) }
}