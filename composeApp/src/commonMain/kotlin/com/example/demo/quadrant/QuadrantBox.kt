package com.example.demo.quadrant

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuadrantBox(title: String, body: String, modifier: Modifier = Modifier) = Column(
    modifier = modifier,
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.spacedBy(
        8.dp, Alignment.CenterVertically
    )
) {
    Text(
        text = title, fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color(0xFF000000)
    )
    Text(
        text = body, fontSize = 14.sp, textAlign = TextAlign.Justify, color = Color(0xFF000000)
    )
}