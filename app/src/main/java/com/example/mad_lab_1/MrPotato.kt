package com.example.mad_lab_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.mad_lab_1.ui.theme.MADlab1Theme

class MrPotato : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent {
            MADlab1Theme {
                MrPotatoScreen();
            }
        }
    }
}

@Composable
fun MrPotatoScreen() {
    Text(text = "Mr Potato Screen")
}