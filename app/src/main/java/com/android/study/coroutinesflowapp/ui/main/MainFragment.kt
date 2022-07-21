package com.android.study.coroutinesflowapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.android.study.coroutinesflowapp.databinding.MainFragmentBinding
import com.android.study.coroutinesflowapp.ui.main.adapter.MonstersAdapter
import com.android.study.coroutinesflowapp.ui.main.adapter.SpellsAdapter
import com.android.study.coroutinesflowapp.utils.Analytics
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class MainFragment : DaggerFragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject
    lateinit var factory: MainViewModelFactory.Factory

    private val viewModel: MainViewModel by viewModels {
        factory.create("myParam")
    }

    private var binding: MainFragmentBinding? = null

    private val adapterMonsters by lazy {
        MonstersAdapter()
    }

    private val adapterSpells by lazy {
        SpellsAdapter()
    }

    @Inject
    fun sendAnalyticsOnCreate(analytics: Analytics) {
        analytics.sendAnalytics()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.searchTv?.doAfterTextChanged {
            viewModel.setQuery(it.toString())
        }
        binding?.searchMonstersRv?.adapter = adapterMonsters
        binding?.searchSpellsRv?.adapter = adapterSpells
        viewModel.monsters.observe(viewLifecycleOwner) {
            it?.let {
                adapterMonsters.submitList(it)
            }
        }
        viewModel.spells.observe(viewLifecycleOwner) {
            it?.let {
                adapterSpells.submitList(it)
            }
        }
    }

}