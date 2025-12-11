package com.example.demo.campus

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp

/**
 * A clickable icon button with circular background on hover.
 *
 * @param icon The [ImageVector] to display
 * @param contentDescription Accessibility description for the icon
 * @param onClick Callback invoked when the button is clicked
 * @param modifier The [Modifier] to apply to this button
 */

@Composable
fun IconButton(
    icon: ImageVector,
    contentDescription: String? = "Icon",
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var isHovered by remember { mutableStateOf(false) }

    Box(
        modifier = modifier.size(48.dp).clip(CircleShape).background(
            if (isHovered) Color.White.copy(alpha = 0.10f) else Color.Transparent
        ).clickable { onClick() }.pointerInput(Unit) {
            awaitPointerEventScope {
                while (true) {
                    val event = awaitPointerEvent()
                    when (event.type) {
                        PointerEventType.Enter -> isHovered = true
                        PointerEventType.Exit -> isHovered = false
                    }
                }
            }
        }.padding(8.dp), contentAlignment = Alignment.Center
    ) {
        Icon(imageVector = icon, contentDescription = contentDescription, tint = Color.White)
    }
}