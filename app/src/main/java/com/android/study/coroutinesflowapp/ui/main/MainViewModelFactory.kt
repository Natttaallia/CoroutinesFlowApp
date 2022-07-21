package com.android.study.coroutinesflowapp.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.study.coroutinesflowapp.api.ApiService
import com.android.study.coroutinesflowapp.api.MonstersRepository
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

/**
 * @author Kulbaka Nataly
 * @date 21.07.2022
 */
class MainViewModelFactory @AssistedInject constructor(
    @Assisted("someParam") private val someParam: String,
    private val networkService: ApiService,
    private val monstersRepository: MonstersRepository
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(someParam, networkService, monstersRepository) as T
    }

    @AssistedFactory
    interface Factory {
        fun create(@Assisted("someParam") someParam: String): MainViewModelFactory
    }

}