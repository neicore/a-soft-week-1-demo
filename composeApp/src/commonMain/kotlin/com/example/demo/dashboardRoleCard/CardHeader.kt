package com.example.demo.dashboardRoleCard

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.icons.Info
import com.example.demo.icons.MoreIcon

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardHeader(title: String, infoText: String? = null, modifier: Modifier = Modifier) =
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = modifier) {
        var openDropdown by remember { mutableStateOf(false) }

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically) {
            Text(text = title, fontSize = 20.sp, color = Color.White)
            val tooltipState = rememberTooltipState()


            infoText?.takeIf { it.isNotEmpty() }?.let {
                TooltipBox(
                    tooltip = { Text(text = "Hello") },
                    positionProvider = TooltipDefaults.rememberTooltipPositionProvider(
                        positioning = TooltipAnchorPosition.Above,
                    ),
                    state = tooltipState,
                ) {
                    Icon(
                        imageVector = Info,
                        contentDescription = "Info Icon",
                        tint = Color(0xFFAC7E4C),
                        modifier = Modifier.size(17.dp)
                    )
                }
            }
        }

        Box {
            Icon(
                imageVector = MoreIcon,
                contentDescription = "More icon",
                tint = Color(0xFF999AAC),
                modifier = Modifier.size(24.dp).clickable { openDropdown = true })

            DisableSelection {
                DropdownMenu(
                    expanded = openDropdown,
                    onDismissRequest = { openDropdown = false },
                    containerColor = Color(0xFF2A2A42),
                    modifier = Modifier.clip(RoundedCornerShape(12.dp)).background(Color(0xFF2A2A42))
                ) {
                    val viewInteractionSource = remember { MutableInteractionSource() }
                    val viewIsHovered by viewInteractionSource.collectIsHoveredAsState()
                    DropdownMenuItem(
                        text = {
                            Text(
                                "View Role", color = Color.White
                            )
                        },
                        onClick = { openDropdown = false },
                        interactionSource = viewInteractionSource,
                        modifier = Modifier.background(
                            if (viewIsHovered) Color(0xFF363650) else Color.Transparent
                        )
                    )

                    val editInteractionSource = remember { MutableInteractionSource() }
                    val editIsHovered by editInteractionSource.collectIsHoveredAsState()
                    DropdownMenuItem(
                        text = {
                            Text(
                                "Edit Role", color = Color.White
                            )
                        },
                        onClick = { openDropdown = false },
                        interactionSource = editInteractionSource,
                        modifier = Modifier.background(
                            if (editIsHovered) Color(0xFF363650) else Color.Transparent
                        )
                    )

                    val deleteInteractionSource = remember { MutableInteractionSource() }
                    val deleteIsHovered by deleteInteractionSource.collectIsHoveredAsState()
                    DropdownMenuItem(
                        text = {
                            Text(
                                "Delete Role", color = Color(0xFFF87171)
                            )
                        },
                        onClick = { openDropdown = false },
                        interactionSource = deleteInteractionSource,
                        modifier = Modifier.background(
                            if (deleteIsHovered) Color(0xFF363650) else Color.Transparent
                        )
                    )
                }
            }
        }

    }