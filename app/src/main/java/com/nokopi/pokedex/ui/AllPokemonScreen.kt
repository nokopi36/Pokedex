package com.nokopi.pokedex.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nokopi.pokedex.data.PokemonEntries
import com.nokopi.pokedex.data.PokemonSpecies
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun AllPokemonScreen(
    viewModel: DataViewModel = viewModel(),
//    pokemonEntries: List<PokemonEntries>,
    onClick: (String) -> Unit
) {
    val state = rememberLazyListState()
    val pokemonList = viewModel.pokemonList
    LaunchedEffect(key1 = Unit) {
        viewModel.query()
    }
    Box {
        LazyColumn(state = state) {
            items(items = pokemonList) { pokemonEntry ->
                AllPokemonView(
                    entryNumber = pokemonEntry.entryNumber,
                    pokemonSpecies = pokemonEntry.pokemonSpecies,
                    onClick = onClick
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun AllPokemonScreenPreview() {
    val pokemonSpecies = PokemonSpecies(
        name = "フシギダネ",
        url = "aaaa"
    )
    val pokemonEntriesList = listOf(
        PokemonEntries(
            entryNumber = 1,
            pokemonSpecies = pokemonSpecies
        ),
        PokemonEntries(
            entryNumber = 2,
            pokemonSpecies = pokemonSpecies
        ),
        PokemonEntries(
            entryNumber = 3,
            pokemonSpecies = pokemonSpecies
        ),
        PokemonEntries(
            entryNumber = 4,
            pokemonSpecies = pokemonSpecies
        ),
        PokemonEntries(
            entryNumber = 5,
            pokemonSpecies = pokemonSpecies
        ),
        PokemonEntries(
            entryNumber = 6,
            pokemonSpecies = pokemonSpecies
        )
    )

//    AllPokemonScreen( = pokemonEntriesList) {}
}