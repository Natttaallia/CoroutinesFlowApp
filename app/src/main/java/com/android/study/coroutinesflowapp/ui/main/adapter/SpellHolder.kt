package com.android.study.coroutinesflowapp.ui.main.adapter

import androidx.recyclerview.widget.RecyclerView
import com.android.study.coroutinesflowapp.api.Monster
import com.android.study.coroutinesflowapp.api.Spell
import com.android.study.coroutinesflowapp.databinding.ViewItemBinding

/**
 * @author Kulbaka Nataly
 * @date 30.06.2022
 */
class SpellHolder(private val bindingView: ViewItemBinding) :
    RecyclerView.ViewHolder(bindingView.root) {

    fun bind(
        data: Spell
    ) {
        bindingView.nameTv.text = data.name
        bindingView.sizeTv.text = data.desc
        bindingView.typeTv.text = data.higherLevel
    }

}