package com.android.study.coroutinesflowapp.api

import com.google.gson.annotations.SerializedName

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
data class Spell(
    @SerializedName("name")
    val name: String,
    @SerializedName("desc")
    val desc: String,
    @SerializedName("higher_level")
    val higherLevel: String
)