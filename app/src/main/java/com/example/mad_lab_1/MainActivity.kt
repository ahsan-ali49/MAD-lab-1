package com.example.mad_lab_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.mad_lab_1.ui.theme.MADlab1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MADlab1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ShowButtons()
                }
            }
        }
    }
}

@Composable
fun ShowButtons(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()){
        Column {
            Text(text = "MAD Lab 1")
            Button(onClick = { /*TODO*/ }) {
                Text("Guessing Game")
            }
            Button(onClick = { /*TODO*/ }) {
             Text(text = "Mr Potato")   
            }
        }
        
//        Text("Hello ")
//        Text("World")
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MADlab1Theme {
//        ShowButtons()
//    }
//}