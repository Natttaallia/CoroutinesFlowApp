package com.android.study.coroutinesflowapp.api

/**
 * @author Kulbaka Nataly
 * @date 21.07.2022
 */
interface MonstersRepository {

    suspend fun getMonsters(query: String): ArrayList<Monster>
}