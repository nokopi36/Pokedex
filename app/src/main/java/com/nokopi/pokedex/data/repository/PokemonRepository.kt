package com.nokopi.pokedex.data.repository

interface PokemonRepository {

    suspend fun getAllPokemon()

}