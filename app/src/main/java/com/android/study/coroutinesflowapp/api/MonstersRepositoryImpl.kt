package com.android.study.coroutinesflowapp.api

import com.android.study.coroutinesflowapp.di.annotations.Monsters
import dagger.hilt.components.SingletonComponent
import it.czerwinski.android.hilt.annotations.BoundTo
import javax.inject.Inject

/**
 * @author Kulbaka Nataly
 * @date 21.07.2022
 */
@BoundTo(supertype = MonstersRepository::class, component = SingletonComponent::class)
class MonstersRepositoryImpl @Inject constructor(
    @Monsters private val apiService: ApiService) : MonstersRepository {
    override suspend fun getMonsters(query: String): ArrayList<Monster> {
        return apiService.searchMonsters(query).results
    }
}