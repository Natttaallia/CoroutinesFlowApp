package com.android.study.coroutinesflowapp.di.modules

import com.android.study.coroutinesflowapp.di.FeatureComponent
import dagger.Module

/**
 * @author Kulbaka Nataly
 * @date 20.07.2022
 */
@Module(
    includes = [NetworkModule::class, AppBindModule::class],
    subcomponents = [FeatureComponent::class]
)
class MainModule {
}