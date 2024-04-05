package com.example.mad_lab_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mad_lab_1.ui.theme.MADlab1Theme
import kotlin.random.Random

class GuessingGame : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MADlab1Theme {
                GuessingGameScreen();
            }
        }
    }
}

@Composable
fun GuessingGameScreen() {
    val valueOnTextField = remember {
        mutableStateOf("")
    }

    val guessMessage = remember {
        mutableStateOf("Try Your Guess!")
    }

    val numberToGuess = remember {
        Random.nextInt(1, 101)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Enter the Number")

        Spacer(modifier = Modifier.size(30.dp))

        TextField(
            value = valueOnTextField.value,
            onValueChange = {
                valueOnTextField.value = it
            },
            label = { Text(text = "Enter Number 1-100") }
        )

        Spacer(modifier = Modifier.size(40.dp))

        Button(onClick = {
            val guessNumber = valueOnTextField.value.toIntOrNull()
            if(guessNumber != null){
                when{
                    guessNumber < numberToGuess -> guessMessage.value = "Too Low, try again!"
                    guessNumber > numberToGuess -> guessMessage.value = "Too High, try again!"
                    else -> guessMessage.value = "You guessed right!"
                }
            }else{
                guessMessage.value = "Please enter a number"
            }
        }) {
            Text(text = "Guess it!")
        }

        Spacer(modifier = Modifier.size(50.dp))

        Text(text = guessMessage.value)
    }
}