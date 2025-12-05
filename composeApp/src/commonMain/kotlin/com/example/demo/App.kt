package com.example.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.demo.subjectTeacherCard.SubjectTeacherCard
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    Column(
        modifier = Modifier.background(MaterialTheme.colorScheme.background).safeContentPadding().fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
//        Birthday card project
//        GreetingImage(message = "Happy Birthday, Sam!", from = "From Emma")

//        Compose article
//        Article(modifier = Modifier.fillMaxHeight())

//        Task Manager
//        TaskCompletionScreen(modifier = Modifier.fillMaxHeight())

//        Compose Quadrant
//        Quadrant(modifier = Modifier.fillMaxSize())

//        Business Card
//        BusinessCard(modifier = Modifier)


//        Subject Teacher Card
        SubjectTeacherCard()
    }
}




