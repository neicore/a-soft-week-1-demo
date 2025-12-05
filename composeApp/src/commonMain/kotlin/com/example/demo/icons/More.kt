package com.example.demo.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val More: ImageVector
    get() {
        if (_More != null) return _More!!

        _More = ImageVector.Builder(
            name = "More",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF141B34)),
                strokeLineWidth = 2.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.9959f, 12f)
                horizontalLineTo(12.0049f)
            }
            path(
                stroke = SolidColor(Color(0xFF141B34)),
                strokeLineWidth = 2.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.9998f, 12f)
                horizontalLineTo(18.0088f)
            }
            path(
                stroke = SolidColor(Color(0xFF141B34)),
                strokeLineWidth = 2.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.99981f, 12f)
                horizontalLineTo(6.00879f)
            }
        }.build()

        return _More!!
    }

private var _More: ImageVector? = null

