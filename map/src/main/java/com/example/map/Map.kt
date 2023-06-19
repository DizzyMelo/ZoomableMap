package com.example.map

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp


@Composable
fun CustomZoomableMap() {
    BoxWithConstraints {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawRect(
                color = Color.Blue,
                topLeft = Offset.Zero,
                size = Size(200f, 200f),
                style = Stroke(width = 1.dp.toPx())
            )
        }
    }
}
