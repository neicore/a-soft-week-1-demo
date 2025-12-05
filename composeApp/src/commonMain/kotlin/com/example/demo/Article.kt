package com.example.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Article(modifier: Modifier = Modifier) = Column(modifier = modifier) {
    ArticleImage()
    ArticleText(modifier = Modifier.padding(6.dp))
}
