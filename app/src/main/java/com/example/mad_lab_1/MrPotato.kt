package com.example.mad_lab_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mad_lab_1.ui.theme.MADlab1Theme

class MrPotato : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent {
            MADlab1Theme {
                MrPotatoScreen()
            }
        }
    }
}

@Composable
fun MrPotatoScreen() {
    var bodyCheck by remember { mutableStateOf(false) }
    val eyesCheck = remember {
        mutableStateOf(false)
    }
    val armsCheck = remember {
        mutableStateOf(false)
    }
    val earsCheck = remember {
        mutableStateOf(false)
    }
    val noseCheck = remember {
        mutableStateOf(false)
    }
    val hatCheck = remember {
        mutableStateOf(false)
    }
    val mouthCheck = remember {
        mutableStateOf(false)
    }
    val shoesCheck = remember {
        mutableStateOf(false)
    }
    val glassesCheck = remember {
        mutableStateOf(false)
    }
    val eyebrowsCheck = remember {
        mutableStateOf(false)
    }
    val mustacheCheck = remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Mr. Potato Head", fontSize = 30.sp)

        Spacer(modifier = Modifier.size(30.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            if (bodyCheck) {
                Image(
                    painter = painterResource(id = R.drawable.body),
                    contentDescription = "body image"
                )
            }
            if (eyesCheck.value) {
                Image(
                    painter = painterResource(id = R.drawable.eyes),
                    contentDescription = "eyes image"
                )
            }
            if (armsCheck.value) {
                Image(
                    painter = painterResource(id = R.drawable.arms),
                    contentDescription = "arms image"
                )
            }
            if(earsCheck.value) {
                Image(
                    painter = painterResource(id = R.drawable.ears),
                    contentDescription = "ears image"
                )
            }
            if(noseCheck.value) {
                Image(
                    painter = painterResource(id = R.drawable.nose),
                    contentDescription = "nose image"
                )
            }
            if (hatCheck.value) {
                Image(
                    painter = painterResource(id = R.drawable.hat),
                    contentDescription = "hat image"
                )
            }
            if (mouthCheck.value) {
                Image(
                    painter = painterResource(id = R.drawable.mouth),
                    contentDescription = "mouth image"
                )
            }
            if(shoesCheck.value) {
                Image(
                    painter = painterResource(id = R.drawable.shoes),
                    contentDescription = "shoes image"
                )
            }
            if(glassesCheck.value) {
                Image(
                    painter = painterResource(id = R.drawable.glasses),
                    contentDescription = "glasses image"
                )
            }
            if(eyebrowsCheck.value) {
                Image(
                    painter = painterResource(id = R.drawable.eyebrows),
                    contentDescription = "eyebrows image"
                )
            }
            if(mustacheCheck.value) {
                Image(
                    painter = painterResource(id = R.drawable.mustache),
                    contentDescription = "mustache image"
                )
            }
        }
        Text(text = "Click his parts to add/remove them!")
        Spacer(modifier = Modifier.size(50.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = bodyCheck, onCheckedChange = {
                    bodyCheck = it
                })
                Text(text = "Body")
            }
            Spacer(modifier = Modifier.size(30.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = eyesCheck.value, onCheckedChange = {
                    eyesCheck.value = it
                })
                Text(text = "Eyes")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = armsCheck.value, onCheckedChange = {
                    armsCheck.value = it
                })
                Text(text = "Arms")
            }
            Spacer(modifier = Modifier.size(30.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = earsCheck.value, onCheckedChange = {
                    earsCheck.value = it
                })
                Text(text = "Ears")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = noseCheck.value, onCheckedChange = {
                    noseCheck.value = it
                })
                Text(text = "Nose")
            }
            Spacer(modifier = Modifier.size(30.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = hatCheck.value, onCheckedChange = {
                    hatCheck.value = it
                })
                Text(text = "Hat")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = mouthCheck.value, onCheckedChange = {
                    mouthCheck.value = it
                })
                Text(text = "Mouth")
            }
            Spacer(modifier = Modifier.size(30.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = shoesCheck.value, onCheckedChange = {
                    shoesCheck.value = it
                })
                Text(text = "Shoes")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = glassesCheck.value, onCheckedChange = {
                    glassesCheck.value = it
                })
                Text(text = "Glasses")
            }
            Spacer(modifier = Modifier.size(30.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = eyebrowsCheck.value, onCheckedChange = {
                    eyebrowsCheck.value = it
                })
                Text(text = "Eyebrows")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = mustacheCheck.value, onCheckedChange = {
                    mustacheCheck.value = it
                })
                Text(text = "Mustache")
            }
        }
    }
}