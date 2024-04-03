package com.example.mad_lab_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlin.random.Random

class GuessingGameActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GuessingGameScreen()
        }
    }
}

@Composable
fun GuessingGameScreen() {
    // State to hold the user's current guess
    var guess by remember { mutableStateOf("") }
    // State to hold the message to the user
    var message by remember { mutableStateOf("Guess a number between 1 and 100") }
    // Generate a random number once when the composable is first called
    val targetNumber = remember { Random.nextInt(1, 101) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = message)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = guess,
            onValueChange = { guess = it },
            label = { Text("Your guess") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                val guessNumber = guess.toIntOrNull()
                if (guessNumber != null) {
                    when {
                        guessNumber < targetNumber -> message = "Too low, try again!"
                        guessNumber > targetNumber -> message = "Too high, try again!"
                        else -> message = "You guessed right!"
                    }
                } else {
                    message = "Please enter a number"
                }
            }
        ) {
            Text("Guess")
        }
    }
}
