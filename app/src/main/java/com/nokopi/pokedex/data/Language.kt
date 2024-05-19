package com.nokopi.pokedex.data

import kotlinx.serialization.Serializable

@Serializable
data class Language(
    val name: String,
    val url: String
)
