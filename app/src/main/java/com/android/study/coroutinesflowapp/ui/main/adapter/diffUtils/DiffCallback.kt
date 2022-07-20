package com.android.study.coroutinesflowapp.ui.main.adapter.diffUtils

import androidx.recyclerview.widget.DiffUtil

/**
 * @author Kulbaka Nataly
 * @date 20.07.2022
 */
class DiffCallback : DiffUtil.ItemCallback<DiffUtilItem>() {

    override fun areItemsTheSame(oldItem: DiffUtilItem, newItem: DiffUtilItem) =
        oldItem.getId() == newItem.getId()

    override fun areContentsTheSame(oldItem: DiffUtilItem, newItem: DiffUtilItem) =
        oldItem == newItem
}