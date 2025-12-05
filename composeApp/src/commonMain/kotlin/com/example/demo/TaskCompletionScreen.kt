package com.example.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import demo.composeapp.generated.resources.Res
import demo.composeapp.generated.resources.ic_task_completed
import org.jetbrains.compose.resources.painterResource

@Composable
fun TaskCompletionScreen(modifier: Modifier = Modifier) = SelectionContainer {
    val image = painterResource(Res.drawable.ic_task_completed)
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically)
    ) {
        Image(
            painter = image,
            contentScale = ContentScale.Fit,
            contentDescription = "Task completed icon",
            modifier = Modifier.width(100.dp).height(100.dp).padding(bottom = 12.dp)
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(text = "Nice work!", fontSize = 18.sp, color = MaterialTheme.colorScheme.onBackground)
    }
}
