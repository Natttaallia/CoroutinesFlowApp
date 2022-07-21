package com.android.study.coroutinesflowapp.di

import com.android.study.coroutinesflowapp.di.annotations.FeatureScope
import com.android.study.coroutinesflowapp.di.modules.FeatureModule
import dagger.Subcomponent
import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent

/**
 * @author Kulbaka Nataly
 * @date 21.07.2022
 */
@FeatureScope
@DefineComponent(parent = SingletonComponent::class)
interface FeatureComponent {

    @DefineComponent.Builder
    interface Builder {
        fun build(): FeatureComponent
    }
}