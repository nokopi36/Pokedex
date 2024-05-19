package com.nokopi.pokedex.data

import kotlinx.serialization.Serializable

@Serializable
data class Descriptions(
    val description: String,
    val language: Language
)
