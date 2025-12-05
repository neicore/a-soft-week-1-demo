package com.example.demo.businessCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import demo.composeapp.generated.resources.Res
import demo.composeapp.generated.resources.profile_pic
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun Profile(modifier: Modifier = Modifier) =
    Column(verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically), horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier) {
        val profilePic = painterResource(Res.drawable.profile_pic)

        Image(
            painter = profilePic,
            contentDescription = "Profile Pic",
            contentScale = ContentScale.Crop,
            modifier = Modifier.width(100.dp).height(100.dp).clip(CircleShape)
        )

        Text(text = "Jane Doe", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(text = "Mkurugenzi Mtendaji", fontSize = 16.sp)
    }