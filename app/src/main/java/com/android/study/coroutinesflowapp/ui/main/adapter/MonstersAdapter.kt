package com.android.study.coroutinesflowapp.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.android.study.coroutinesflowapp.R
import com.android.study.coroutinesflowapp.api.Monster
import com.android.study.coroutinesflowapp.databinding.ViewItemBinding
import com.android.study.coroutinesflowapp.ui.main.adapter.diffUtils.DiffCallback
import com.android.study.coroutinesflowapp.ui.main.adapter.diffUtils.DiffUtilItem

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
class MonstersAdapter : ListAdapter<DiffUtilItem, RecyclerView.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ViewItemBinding.bind(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.view_item, parent, false)
        )
        return MonsterHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MonsterHolder).bind(currentList[position] as Monster)
    }

    override fun getItemCount(): Int {
        return currentList.size
    }
}