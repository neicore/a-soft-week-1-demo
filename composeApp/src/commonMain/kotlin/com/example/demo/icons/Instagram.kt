package com.example.demo.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Instagram: ImageVector
    get() {
        if (_Instagram != null) return _Instagram!!

        _Instagram = ImageVector.Builder(
            name = "Instagram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                arcTo(5f, 5f, 0f, false, true, 22f, 7f)
                verticalLineTo(17f)
                arcTo(5f, 5f, 0f, false, true, 17f, 22f)
                horizontalLineTo(7f)
                arcTo(5f, 5f, 0f, false, true, 2f, 17f)
                verticalLineTo(7f)
                arcTo(5f, 5f, 0f, false, true, 7f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 11.37f)
                arcTo(4f, 4f, 0f, true, true, 12.63f, 8f)
                arcTo(4f, 4f, 0f, false, true, 16f, 11.37f)
                moveToRelative(1.5f, -4.87f)
                horizontalLineToRelative(0.01f)
            }
        }.build()

        return _Instagram!!
    }

private var _Instagram: ImageVector? = null

