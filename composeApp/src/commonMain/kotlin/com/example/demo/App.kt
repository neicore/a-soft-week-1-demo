package com.example.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

val Campuses = listOf(
    CampusData(campusName = "Sunrise Campus", rolesCount = 25),
    CampusData(campusName = "Riverfront Campus", rolesCount = 33),
    CampusData(campusName = "Mountain View Campus", rolesCount = 17),
    CampusData(campusName = "Oceanfront Campus", rolesCount = 21),
    CampusData(campusName = "Forest Hill Campus", rolesCount = 14),
    CampusData(campusName = "Urban Center", rolesCount = 46)
)

@Composable
@Preview
fun App() {
    Column(
        modifier = Modifier.background(Color(0xFF161616)).safeContentPadding().fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier.padding(8.dp).background(Color(0xFF191F29))) {
            Campuses.forEach { (campusName, rolesCount) ->
                Campus(
                    campusName = campusName,
                    rolesCount = rolesCount,
                    onClick = {},
                    onClickMore = {},
                    onClickPlus = {},
                )
            }
        }

//        RoleCard()
//        CustomTooltip(
//            tooltipContent = { Text("Tooltip text", color = Color.White) },
//            trigger = {
//                Icon(
//                    imageVector = Info,
//                    contentDescription = "Info"
//                )
//            })
    }
}




