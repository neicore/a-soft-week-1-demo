package com.example.demo.businessCard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.demo.icons.Instagram
import com.example.demo.icons.Mail
import com.example.demo.icons.PhoneCall
import org.jetbrains.compose.ui.tooling.preview.Preview

data class ContactDetail(
    val icon: ImageVector, val detail: String, val contentDescription: String
)

@Composable
@Preview
fun ContactDetails(modifier: Modifier = Modifier) =
    Column(verticalArrangement = Arrangement.spacedBy(6.dp), modifier = modifier.width(IntrinsicSize.Max)) {
        val contacts = listOf(
            ContactDetail(PhoneCall, "+255 678 645 101", "Phone"),
            ContactDetail(Instagram, "@janetDoeForReal", "Instagram"),
            ContactDetail(Mail, "jane@example.com", "Email"),
        )

        contacts.forEach { contact ->
            ContactDetailsRow(
                icon = {
                    Icon(
                        imageVector = contact.icon,
                        contentDescription = contact.contentDescription,
                        tint = Color.White,
                        modifier = Modifier.size(16.dp),
                    )
                },
                detail = contact.detail,
                modifier = Modifier.clip(
                    RoundedCornerShape(10.dp)
                ).background(Color(0xFF37474F))
                    .padding(top = 8.dp, bottom = 8.dp, start = 12.dp, end = 12.dp).fillMaxWidth()
            )
        }

    }