package com.example.demo.roleCard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.demo.icons.Key
import com.example.demo.icons.Users
import org.jetbrains.compose.ui.tooling.preview.Preview
import kotlin.random.Random

val Stats = listOf(
    Stat(icon = Key, iconContentDescription = "Key Icon", title = "Permissions", value = Random.nextInt(10, 101)),
    Stat(
        icon = Users,
        iconContentDescription = "Users Icon",
        title = "Users Assigned",
        value = Random.nextInt(10, 101)
    ),
)

@Composable
@Preview
fun RoleCard(modifier: Modifier = Modifier) =
    SelectionContainer {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = modifier.padding(16.dp).clip(RoundedCornerShape(16.dp)).background(Color(0xFF1F1F37))
                .padding(16.dp)
        ) {
            CardHeader(
                title = "Subject",
                infoText = "More Info",
                modifier = Modifier.fillMaxWidth()
            )

            CardBody(text = "Has full access to oversee academic, financial, and administrative operations, ensuring smooth coordination across the school.")

            CardFooter(
                stats = Stats,
            )
        }
    }
