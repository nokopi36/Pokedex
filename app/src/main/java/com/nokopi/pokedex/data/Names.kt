package com.nokopi.pokedex.data

import kotlinx.serialization.Serializable

@Serializable
data class Names(
    val name: String,
    val language: Language
)
