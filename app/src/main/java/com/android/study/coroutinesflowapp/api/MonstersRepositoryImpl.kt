package com.android.study.coroutinesflowapp.api

import javax.inject.Inject

/**
 * @author Kulbaka Nataly
 * @date 21.07.2022
 */
class MonstersRepositoryImpl @Inject constructor(private val apiService: ApiService) : MonstersRepository {
    override suspend fun getMonsters(query: String): ArrayList<Monster> {
        return apiService.searchMonsters(query).results
    }
}