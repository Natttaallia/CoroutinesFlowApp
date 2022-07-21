package com.android.study.coroutinesflowapp

import android.content.Context
import com.android.study.coroutinesflowapp.di.DaggerAppComponent
import com.android.study.coroutinesflowapp.di.modules.AppsDeps
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).appDeps(AppDepsImpl()).build()
    }

    private inner class AppDepsImpl : AppsDeps {
        override val context: Context
            get() = applicationContext
    }
}