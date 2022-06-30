package com.android.study.coroutinesflowapp.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.study.coroutinesflowapp.R
import com.android.study.coroutinesflowapp.api.Spell
import com.android.study.coroutinesflowapp.databinding.ViewItemBinding

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
class SpellsAdapter(
    private var data: List<Spell>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ViewItemBinding.bind(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.view_item, parent, false)
        )
        return SpellHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as SpellHolder).bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun updateData(data: List<Spell>) {
        this.data = data
        notifyDataSetChanged()
    }
}