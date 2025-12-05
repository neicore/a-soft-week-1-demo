package com.example.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import demo.composeapp.generated.resources.Res
import demo.composeapp.generated.resources.bg_compose_background
import org.jetbrains.compose.resources.painterResource

@Composable
fun ArticleImage(modifier: Modifier = Modifier) = Box(modifier = modifier.fillMaxWidth().height(150.dp)) {
    val image = painterResource(Res.drawable.bg_compose_background)
    Image(
        painter = image,
        contentScale = ContentScale.Crop,
        contentDescription = "Article image",
        modifier = Modifier.fillMaxWidth()
    )
}
