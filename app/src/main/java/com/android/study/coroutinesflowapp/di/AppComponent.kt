package com.android.study.coroutinesflowapp.di

import com.android.study.coroutinesflowapp.App
import com.android.study.coroutinesflowapp.di.modules.FragmentBuildersModule
import com.android.study.coroutinesflowapp.di.modules.MainModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * @author Kulbaka Nataly
 * @date 20.07.2022
 */
@Singleton
@Component(
    modules = [ AndroidSupportInjectionModule::class, FragmentBuildersModule::class, MainModule::class ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: App): Builder

        fun build(): AppComponent
    }
}