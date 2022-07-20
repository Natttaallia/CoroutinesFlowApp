package com.android.study.coroutinesflowapp.ui.main.adapter.diffUtils

/**
 * @author Kulbaka Nataly
 * @date 20.07.2022
 */
interface DiffUtilItem {

    fun getId(): Int

    override fun equals(other: Any?): Boolean
}