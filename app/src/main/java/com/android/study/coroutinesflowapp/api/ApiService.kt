package com.android.study.coroutinesflowapp.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
interface ApiService {
    @GET("monsters")
    suspend fun searchMonsters(@Query("search") query: String): ApiMonstersResponse

    @GET("spells")
    suspend fun searchSpells(@Query("search") query: String): ApiSpellsResponse

    companion object {

        fun provideRetrofit(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://api.open5e.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(OkHttpClient.Builder().build())
                .build()
        }

        inline fun <reified T> provideService(retrofit: Retrofit): T {
            return retrofit.create(T::class.java)
        }
    }
}