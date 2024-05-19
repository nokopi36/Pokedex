package com.nokopi.pokedex.ui

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nokopi.pokedex.data.ApiResult
import com.nokopi.pokedex.data.PokemonEntries
import fuel.Fuel
import fuel.get
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json

class DataViewModel: ViewModel() {
    var pokemonList = mutableStateListOf<PokemonEntries>()

    fun query() {
        viewModelScope.launch {
            val apiResult = Fuel.get(
                """
                    https://pokeapi.co/api/v2/pokedex/national/
                """.trimIndent().replace(System.lineSeparator(),"")
            ).body
            val json = Json { ignoreUnknownKeys=true }
            val result = json.decodeFromString<ApiResult>(apiResult)
            pokemonList.apply {
                clear()
                addAll(result.pokemonEntries)
            }
        }
    }
}