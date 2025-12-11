package com.example.demo.greeting

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import demo.composeapp.generated.resources.Res
import demo.composeapp.generated.resources.androidparty
import org.jetbrains.compose.resources.painterResource

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) =
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        val image = painterResource(Res.drawable.androidparty)
        Image(
            painter = image,
            contentDescription = "Card background",
            contentScale = ContentScale.Crop,
            alpha = 0.5F,
            modifier = modifier.fillMaxSize()
        )
        GreetingText(message, from, modifier = modifier.padding(8.dp))
    }

