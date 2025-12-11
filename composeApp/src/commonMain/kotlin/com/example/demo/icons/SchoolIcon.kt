package com.example.demo.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SchoolIcon: ImageVector
    get() {
        if (_SchoolIcon != null) return _SchoolIcon!!

        _SchoolIcon = ImageVector.Builder(
            name = "SchoolIcon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF4DB6AC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.5315f, 6.41435f)
                curveTo(11.8054f, 6.19522f, 12.1946f, 6.19522f, 12.4685f, 6.41435f)
                lineTo(17.4685f, 10.4143f)
                curveTo(17.6464f, 10.5567f, 17.75f, 10.7722f, 17.75f, 11f)
                verticalLineTo(22f)
                horizontalLineTo(12.75f)
                verticalLineTo(18f)
                horizontalLineTo(11.25f)
                verticalLineTo(22f)
                horizontalLineTo(6.25f)
                verticalLineTo(11f)
                curveTo(6.25f, 10.7722f, 6.35357f, 10.5567f, 6.53148f, 10.4143f)
                lineTo(11.5315f, 6.41435f)
                close()
                moveTo(13.009f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13.009f)
                verticalLineTo(12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4DB6AC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.3349f, 12.3281f)
                lineTo(21.7495f, 14.5354f)
                verticalLineTo(21.9989f)
                horizontalLineTo(20.2495f)
                verticalLineTo(15.4625f)
                lineTo(16.6641f, 13.6698f)
                lineTo(17.3349f, 12.3281f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4DB6AC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.75f, 15.4644f)
                lineTo(7.33541f, 13.6717f)
                lineTo(6.66459f, 12.3301f)
                lineTo(2.25f, 14.5374f)
                verticalLineTo(22.0009f)
                horizontalLineTo(3.75f)
                verticalLineTo(15.4644f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4DB6AC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.25f, 21.25f)
                horizontalLineTo(22.75f)
                verticalLineTo(22.75f)
                horizontalLineTo(1.25f)
                verticalLineTo(21.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4DB6AC))
            ) {
                moveTo(11.25f, 2f)
                curveTo(11.25f, 1.58579f, 11.5858f, 1.25f, 12f, 1.25f)
                curveTo(14.2166f, 1.25f, 15.466f, 2.09382f, 16.1229f, 3.07336f)
                curveTo(16.4368f, 3.54143f, 16.592f, 4.00628f, 16.6694f, 4.35261f)
                curveTo(16.7084f, 4.52671f, 16.75f, 4.73763f, 16.75f, 4.9822f)
                verticalLineTo(5.7322f)
                horizontalLineTo(12.75f)
                verticalLineTo(6.99999f)
                curveTo(12.75f, 7.4142f, 12.4142f, 7.74999f, 12f, 7.74999f)
                curveTo(11.5858f, 7.74999f, 11.25f, 7.4142f, 11.25f, 6.99999f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _SchoolIcon!!
    }

private var _SchoolIcon: ImageVector? = null

