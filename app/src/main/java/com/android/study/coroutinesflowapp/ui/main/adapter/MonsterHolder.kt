package com.android.study.coroutinesflowapp.ui.main.adapter

import androidx.recyclerview.widget.RecyclerView
import com.android.study.coroutinesflowapp.api.Monster
import com.android.study.coroutinesflowapp.databinding.ViewItemBinding

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
class MonsterHolder(private val bindingView: ViewItemBinding) :
    RecyclerView.ViewHolder(bindingView.root) {

    fun bind(
        data: Monster
    ) {
        bindingView.nameTv.text = data.name
        bindingView.sizeTv.text = data.size
        bindingView.typeTv.text = data.type
    }

}