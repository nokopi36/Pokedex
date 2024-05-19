package com.nokopi.pokedex.domain.repository

import com.nokopi.pokedex.data.repository.PokemonRepository
import fuel.Fuel
import fuel.get

class PokemonRepositoryImpl(): PokemonRepository{
    override suspend fun getAllPokemon() {
        val apiResult = Fuel.get(
            """
                https://pokeapi.co/api/v2/pokedex/national/
            """.trimIndent().replace(System.lineSeparator(),"")
        ).body
    }
}