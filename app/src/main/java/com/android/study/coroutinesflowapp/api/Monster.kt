package com.android.study.coroutinesflowapp.api

import com.google.gson.annotations.SerializedName

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
data class Monster(
    @SerializedName("name")
    val name: String,
    @SerializedName("size")
    val size: String,
    @SerializedName("type")
    val type: String
)