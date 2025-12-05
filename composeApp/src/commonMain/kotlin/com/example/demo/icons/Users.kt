package com.example.demo.icons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Users: ImageVector
    get() {
        if (_Users != null) return _Users!!

        _Users = ImageVector.Builder(
            name = "Users",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF141B34)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(18.6161f, 20f)
                horizontalLineTo(19.1063f)
                curveTo(20.2561f, 20f, 21.1707f, 19.4761f, 21.9919f, 18.7436f)
                curveTo(24.078f, 16.8826f, 19.1741f, 15f, 17.5f, 15f)
                moveTo(15.5f, 5.06877f)
                curveTo(15.7271f, 5.02373f, 15.9629f, 5f, 16.2048f, 5f)
                curveTo(18.0247f, 5f, 19.5f, 6.34315f, 19.5f, 8f)
                curveTo(19.5f, 9.65685f, 18.0247f, 11f, 16.2048f, 11f)
                curveTo(15.9629f, 11f, 15.7271f, 10.9763f, 15.5f, 10.9312f)
            }
            path(
                stroke = SolidColor(Color(0xFF141B34)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(4.48131f, 16.1112f)
                curveTo(3.30234f, 16.743f, 0.211137f, 18.0331f, 2.09388f, 19.6474f)
                curveTo(3.01359f, 20.436f, 4.03791f, 21f, 5.32572f, 21f)
                horizontalLineTo(12.6743f)
                curveTo(13.9621f, 21f, 14.9864f, 20.436f, 15.9061f, 19.6474f)
                curveTo(17.7889f, 18.0331f, 14.6977f, 16.743f, 13.5187f, 16.1112f)
                curveTo(10.754f, 14.6296f, 7.24599f, 14.6296f, 4.48131f, 16.1112f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF141B34)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(13f, 7.5f)
                curveTo(13f, 9.70914f, 11.2091f, 11.5f, 9f, 11.5f)
                curveTo(6.79086f, 11.5f, 5f, 9.70914f, 5f, 7.5f)
                curveTo(5f, 5.29086f, 6.79086f, 3.5f, 9f, 3.5f)
                curveTo(11.2091f, 3.5f, 13f, 5.29086f, 13f, 7.5f)
                close()
            }
        }.build()

        return _Users!!
    }

private var _Users: ImageVector? = null

