package com.example.mad_lab_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.body), contentDescription = "body image")
        Image(painter = painterResource(id = R.drawable.eyes), contentDescription = "eyes image")
        Image(painter = painterResource(id = R.drawable.arms), contentDescription = "arms image")
        Image(painter = painterResource(id = R.drawable.ears), contentDescription = "ears image")
        Image(painter = painterResource(id = R.drawable.nose), contentDescription = "nose image")
        Image(painter = painterResource(id = R.drawable.hat), contentDescription = "hat image")
        Image(painter = painterResource(id = R.drawable.mouth), contentDescription = "mouth image")
        Image(painter = painterResource(id = R.drawable.shoes), contentDescription = "shoes image")
        Image(painter = painterResource(id = R.drawable.glasses), contentDescription = "glasses image")
        Image(painter = painterResource(id = R.drawable.eyebrows), contentDescription = "eyebrows image")
        Image(painter = painterResource(id = R.drawable.mustache), contentDescription = "mustache image")
    }
}