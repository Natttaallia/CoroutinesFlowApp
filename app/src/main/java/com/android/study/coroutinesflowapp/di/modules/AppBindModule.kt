package com.android.study.coroutinesflowapp.di.modules

import com.android.study.coroutinesflowapp.api.MonstersRepository
import com.android.study.coroutinesflowapp.api.MonstersRepositoryImpl
import dagger.Binds
import dagger.Module

/**
 * @author Kulbaka Nataly
 * @date 21.07.2022
 */
@Module
interface AppBindModule {

    @Binds
    fun bindsMonstersRepositoryImpl_to_MonstersRepository(monstersRepositoryImpl: MonstersRepositoryImpl): MonstersRepository
}