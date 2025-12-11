package com.example.demo.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlusIcon: ImageVector
    get() {
        if (_PlusIcon != null) return _PlusIcon!!

        _PlusIcon = ImageVector.Builder(
            name = "PlusIcon",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.9974f, 1.83398f)
                curveTo(8.45763f, 1.83398f, 8.83073f, 2.20708f, 8.83073f, 2.66732f)
                verticalLineTo(13.334f)
                curveTo(8.83073f, 13.7942f, 8.45763f, 14.1673f, 7.9974f, 14.1673f)
                curveTo(7.53716f, 14.1673f, 7.16406f, 13.7942f, 7.16406f, 13.334f)
                verticalLineTo(2.66732f)
                curveTo(7.16406f, 2.20708f, 7.53716f, 1.83398f, 7.9974f, 1.83398f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.83594f, 8.0013f)
                curveTo(1.83594f, 7.54106f, 2.20903f, 7.16797f, 2.66927f, 7.16797f)
                horizontalLineTo(13.3359f)
                curveTo(13.7962f, 7.16797f, 14.1693f, 7.54106f, 14.1693f, 8.0013f)
                curveTo(14.1693f, 8.46154f, 13.7962f, 8.83464f, 13.3359f, 8.83464f)
                horizontalLineTo(2.66927f)
                curveTo(2.20903f, 8.83464f, 1.83594f, 8.46154f, 1.83594f, 8.0013f)
                close()
            }
        }.build()

        return _PlusIcon!!
    }

private var _PlusIcon: ImageVector? = null

