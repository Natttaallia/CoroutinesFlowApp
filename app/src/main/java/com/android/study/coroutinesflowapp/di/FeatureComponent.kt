package com.android.study.coroutinesflowapp.di

import com.android.study.coroutinesflowapp.di.annotations.FeatureScope
import com.android.study.coroutinesflowapp.di.modules.FeatureModule
import dagger.Subcomponent

/**
 * @author Kulbaka Nataly
 * @date 21.07.2022
 */
@FeatureScope
@Subcomponent(modules = [FeatureModule::class])
interface FeatureComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): FeatureComponent
    }
}