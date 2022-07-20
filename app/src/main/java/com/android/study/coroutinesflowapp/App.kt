package com.android.study.coroutinesflowapp

import com.android.study.coroutinesflowapp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}