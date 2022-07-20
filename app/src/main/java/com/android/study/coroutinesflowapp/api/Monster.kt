package com.android.study.coroutinesflowapp.api

import com.android.study.coroutinesflowapp.ui.main.adapter.diffUtils.DiffUtilItem

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
data class Monster(
    val name: String,
    val size: String,
    val type: String
) : DiffUtilItem {
    override fun getId(): Int = name.hashCode()
}