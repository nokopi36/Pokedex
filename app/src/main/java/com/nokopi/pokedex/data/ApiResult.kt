package com.nokopi.pokedex.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiResult(
    val descriptions: List<Descriptions>,
    val names: List<Names>,
    @SerialName("pokemon_entries")
    val pokemonEntries: List<PokemonEntries>,
//    @SerialName("version_groups")
//    val versionGroups: String
)
