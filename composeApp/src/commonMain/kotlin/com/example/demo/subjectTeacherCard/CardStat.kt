package com.example.demo.subjectTeacherCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardStat(
    stat: Stat,
    modifier: Modifier = Modifier
) = Row(
    horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterHorizontally),
    verticalAlignment = Alignment.CenterVertically,
    modifier = modifier
) {
    Icon(
        imageVector = stat.icon,
        contentDescription = stat.iconContentDescription,
        tint = Color(0xFF999AAC),
        modifier = Modifier.size(16.dp)
    )

    Text(text = stat.title, color = Color(0xFF999AAC), fontSize = 16.sp)

    Text(text = stat.value.toString(), color = Color.White, fontWeight = FontWeight.Medium, fontSize = 16.sp)
}