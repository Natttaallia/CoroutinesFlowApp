package com.android.study.coroutinesflowapp.api

import com.google.gson.annotations.SerializedName

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
data class ApiSpellsResponse(
    @SerializedName("results")
    val results: ArrayList<Spell>
)