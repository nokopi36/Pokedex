package com.nokopi.pokedex.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.nokopi.pokedex.data.PokemonSpecies

@Composable
fun AllPokemonView(
    entryNumber: Int,
    pokemonSpecies: PokemonSpecies,
    modifier: Modifier = Modifier,
    onClick: (String) -> Unit
) {
    Column(
        modifier = modifier
            .clickable { onClick(pokemonSpecies.url) }
    ) {
        Text(
            text = entryNumber.toString(),
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = pokemonSpecies.name,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}


@Preview
@Composable
private fun AllPokemonViewPreview() {
    AllPokemonView(
        entryNumber = 1,
        pokemonSpecies = PokemonSpecies(
            name = "フシギダネ",
            url = "aasaa"
        )
    ) {

    }
}