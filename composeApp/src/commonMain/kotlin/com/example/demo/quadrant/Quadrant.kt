package com.example.demo.quadrant

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Quadrant(modifier: Modifier = Modifier) = Column(modifier = modifier) {
    Row(modifier = Modifier.weight(1f)) {
        QuadrantBox(
            title = "Text composable",
            body = "Displays text and follows the recommended Material Design guidelines.",
            modifier = Modifier.weight(1f).fillMaxSize().background(Color(0xFFEADDFF)).padding(16.dp)
        )

        QuadrantBox(
            title = "Image composable",
            body = "Creates a composable that lays out and draws a given Painter class object.",
            modifier = Modifier.weight(1f).fillMaxSize().background(Color(0xFFD0BCFF)).padding(16.dp)
        )
    }

    Row(modifier = Modifier.weight(1f)) {
        QuadrantBox(
            title = "Row composable",
            body = "A layout composable that places its children in a horizontal sequence.",
            modifier = Modifier.weight(1f).fillMaxSize().background(Color(0xFFB69DF8)).padding(16.dp)
        )

        QuadrantBox(
            title = "Column composable",
            body = "A layout composable that places its children in a vertical sequence.",
            modifier = Modifier.weight(1f).fillMaxSize().background(Color(0xFFF6EDFF)).padding(16.dp)
        )
    }
}
