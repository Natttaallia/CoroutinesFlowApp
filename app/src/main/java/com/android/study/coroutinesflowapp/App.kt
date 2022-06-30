package com.android.study.coroutinesflowapp

import android.app.Application
import com.android.study.coroutinesflowapp.di.mainModule
import com.android.study.coroutinesflowapp.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(
                networkModule,
                mainModule
            )
        }

    }
}