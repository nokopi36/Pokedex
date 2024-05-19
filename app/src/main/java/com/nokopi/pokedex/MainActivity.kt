package com.nokopi.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.nokopi.pokedex.ui.AllPokemonScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AllPokemonScreen {

            }
        }
    }
}


@Composable
fun Test() {
    Text(text = "aaaa")
}


@Preview(showBackground = true)
@Composable
private fun TestPreview() {
    Test()
}