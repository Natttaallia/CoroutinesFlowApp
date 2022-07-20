package com.android.study.coroutinesflowapp.api

import com.android.study.coroutinesflowapp.ui.main.adapter.diffUtils.DiffUtilItem
import com.google.gson.annotations.SerializedName

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
data class Spell(
    val name: String,
    val desc: String,
    @SerializedName("higher_level")
    val higherLevel: String
) : DiffUtilItem {
    override fun getId(): Int = name.hashCode()
}