package com.android.study.coroutinesflowapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.study.coroutinesflowapp.api.Monster
import com.android.study.coroutinesflowapp.api.ApiService
import com.android.study.coroutinesflowapp.api.Spell
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class MainViewModel(private val networkService: ApiService) : ViewModel() {
    private var jobMonsters: Job? = null
    private var jobSpells: Job? = null
    private val query = MutableStateFlow<String?>("")
    private val _monsters = MutableLiveData<List<Monster>?>(arrayListOf())
    val monsters: LiveData<List<Monster>?>
        get() = _monsters

    private val _spells = MutableLiveData<List<Spell>?>(arrayListOf())
    val spells: LiveData<List<Spell>?>
        get() = _spells

    init {
        viewModelScope.launch {
            query
                .debounce(300)
                .filter { query ->
                    if (query.isNullOrEmpty()) {
                        jobSpells?.cancel()
                        jobMonsters?.cancel()
                        _monsters.value = listOf()
                        _spells.value = listOf()
                        return@filter false
                    } else {
                        return@filter true
                    }
                }
                .distinctUntilChanged()
                .collectLatest {
                    makeMonsterWebSearch(it)
                    makeSpellsWebSearch(it)
                }
        }

    }

    private fun makeMonsterWebSearch(query: String?) {
        jobMonsters?.cancel()
        jobMonsters = viewModelScope.launch(Dispatchers.IO) {
            val response =
                networkService.searchMonsters(query ?: "")
            withContext(Dispatchers.Main) {
                _monsters.value = response.results
            }
        }
    }

    private fun makeSpellsWebSearch(query: String?) {
        jobSpells?.cancel()
        jobSpells = viewModelScope.launch(Dispatchers.IO) {
            val response =
                networkService.searchSpells(query ?: "")
            withContext(Dispatchers.Main) {
                _spells.value = response.results
            }
        }
    }

    fun setQuery(text: String?) {
        query.value = text
    }
}