package com.android.study.coroutinesflowapp.di

import com.android.study.coroutinesflowapp.ui.main.MainFragment
import com.android.study.coroutinesflowapp.ui.main.MainViewModel
import org.koin.dsl.module
import org.koin.androidx.fragment.dsl.fragment
import org.koin.androidx.viewmodel.dsl.viewModel

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
val mainModule = module {
    viewModel { MainViewModel(get()) }
    fragment { MainFragment() }
}