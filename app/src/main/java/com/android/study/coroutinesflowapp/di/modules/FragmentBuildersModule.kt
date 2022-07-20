package com.android.study.coroutinesflowapp.di.modules

import com.android.study.coroutinesflowapp.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author Kulbaka Nataly
 * @date 20.07.2022
 */
@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment
}