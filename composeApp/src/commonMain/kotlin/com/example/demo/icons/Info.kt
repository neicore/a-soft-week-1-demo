package com.example.demo.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Info: ImageVector
    get() {
        if (_Info != null) return _Info!!

        _Info = ImageVector.Builder(
            name = "Info",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF141B34)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(22f, 12f)
                curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
                curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
                curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
                curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF141B34)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.2422f, 17f)
                verticalLineTo(12f)
                curveTo(12.2422f, 11.5286f, 12.2422f, 11.2929f, 12.0957f, 11.1464f)
                curveTo(11.9493f, 11f, 11.7136f, 11f, 11.2422f, 11f)
            }
            path(
                stroke = SolidColor(Color(0xFF141B34)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.992f, 8f)
                horizontalLineTo(12.001f)
            }
        }.build()

        return _Info!!
    }

private var _Info: ImageVector? = null

