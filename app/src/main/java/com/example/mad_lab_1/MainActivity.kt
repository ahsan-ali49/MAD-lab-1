package com.example.mad_lab_1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mad_lab_1.ui.theme.MADlab1Theme
import androidx.compose.ui.text.TextStyle


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MADlab1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ShowButtons( { task ->
                        when (task) {
                            1 -> navigateToGuessingGame()
                            2 -> navigateToMrPotato()
                        }
                    })
                }
            }
        }
    }
    private fun navigateToGuessingGame() {
        val intent = Intent(this, GuessingGameActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToMrPotato() {
        val intent = Intent(this, MrPotatoActivity::class.java)
        startActivity(intent)
    }
}

@Composable
fun ShowButtons(onTaskSelected: (Int) -> Unit,modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(
                text = "MAD Lab 1",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(32.dp)) // Add more space between the heading and buttons

            Button(onClick = { onTaskSelected(1) }) {
                Text(
                    text = "Guessing Game"
                )
            }
            Button(onClick = { onTaskSelected(2) }) {
                Text(
                    text = "Mr. Potato"
                )
            }
        }
    }
}

//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MADlab1Theme {
//        ShowButtons()
//    }
//}