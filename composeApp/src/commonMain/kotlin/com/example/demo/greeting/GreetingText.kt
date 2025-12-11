package com.example.demo.greeting

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) =
    Column(verticalArrangement = Arrangement.Center, modifier = modifier) {
        Text(
            text = message, fontSize = 70.sp, lineHeight = 116.sp, textAlign = TextAlign.Center, color = Color.Black
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = modifier.padding(16.dp).align(alignment = Alignment.CenterHorizontally),
            color = Color.Black
        )
    }
