package com.android.study.coroutinesflowapp.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.study.coroutinesflowapp.R
import com.android.study.coroutinesflowapp.api.Monster
import com.android.study.coroutinesflowapp.databinding.ViewItemBinding

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
class MonstersAdapter(
    private var data: List<Monster>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ViewItemBinding.bind(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.view_item, parent, false)
        )
        return MonsterHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MonsterHolder).bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun updateData(data: List<Monster>) {
        this.data = data
        notifyDataSetChanged()
    }
}