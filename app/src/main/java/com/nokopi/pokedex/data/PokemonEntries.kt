package com.nokopi.pokedex.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonEntries(
    @SerialName("entry_number")
    val entryNumber: Int,
    @SerialName("pokemon_species")
    val pokemonSpecies: PokemonSpecies
)
