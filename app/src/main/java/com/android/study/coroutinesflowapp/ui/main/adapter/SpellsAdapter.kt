package com.android.study.coroutinesflowapp.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.android.study.coroutinesflowapp.R
import com.android.study.coroutinesflowapp.api.Spell
import com.android.study.coroutinesflowapp.databinding.ViewItemBinding
import com.android.study.coroutinesflowapp.ui.main.adapter.diffUtils.DiffCallback
import com.android.study.coroutinesflowapp.ui.main.adapter.diffUtils.DiffUtilItem

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
class SpellsAdapter : ListAdapter<DiffUtilItem, RecyclerView.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ViewItemBinding.bind(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.view_item, parent, false)
        )
        return SpellHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as SpellHolder).bind(currentList[position] as Spell)
    }

    override fun getItemCount(): Int {
        return currentList.size
    }
}