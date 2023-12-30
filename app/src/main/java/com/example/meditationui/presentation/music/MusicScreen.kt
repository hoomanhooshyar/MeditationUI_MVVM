package com.example.meditationui.presentation.music

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import com.example.meditationui.presentation.util.standardQuadFromTo
import com.example.meditationui.ui.theme.OrangeYellow1
import com.example.meditationui.ui.theme.OrangeYellow2
import com.example.meditationui.ui.theme.OrangeYellow3

@Composable
fun MusicScreen() {
    BoxWithConstraints(
        modifier = Modifier
            .background(OrangeYellow3)
    ) {
        val width = constraints.maxWidth
        val height = constraints.maxHeight

        //Medium colored path
        val mediumColoredPoint1 = Offset(0f,height * 0.3f)
        val mediumColoredPoint2 = Offset(width * 0.1f,height * 0.35f)
        val mediumColoredPoint3 = Offset(width * 0.4f,height * 0.05f)
        val mediumColoredPoint4 = Offset(width * 0.75f,height * 0.7f)
        val mediumColoredPoint5 = Offset(width * 1.4f,-height.toFloat())

        val mediumColoredPath = Path().apply {
            moveTo(mediumColoredPoint1.x,mediumColoredPoint1.y)
            standardQuadFromTo(mediumColoredPoint1,mediumColoredPoint2)
            standardQuadFromTo(mediumColoredPoint2,mediumColoredPoint3)
            standardQuadFromTo(mediumColoredPoint3,mediumColoredPoint4)
            standardQuadFromTo(mediumColoredPoint4,mediumColoredPoint5)
            lineTo(width.toFloat() + 100f,height.toFloat() + 100f)
            lineTo(-100f,height.toFloat() + 100f)
            close()
        }

        //Light Colored Path
        val lightPoint1 = Offset(0f,height * 0.35f)
        val lightPoint2 = Offset(width * 0.1f,height * 0.4f)
        val lightPoint3 = Offset(width * 0.3f,height * 0.35f)
        val lightPoint4 = Offset(width * 0.65f,height.toFloat())
        val lightPoint5 = Offset(width * 1.4f,-height.toFloat() / 3f)

        val lightColoredPath = Path().apply {
            moveTo(lightPoint1.x,lightPoint1.y)
            standardQuadFromTo(lightPoint1,lightPoint2)
            standardQuadFromTo(lightPoint2,lightPoint3)
            standardQuadFromTo(lightPoint3,lightPoint4)
            standardQuadFromTo(lightPoint4,lightPoint5)
            lineTo(width.toFloat() + 100f,height.toFloat() + 100f)
            lineTo(-100f,height.toFloat() + 100f)
            close()
        }
        Canvas(
            modifier = Modifier.fillMaxSize()
        ){
            drawPath(
                path = mediumColoredPath,
                color = OrangeYellow2
            )
            drawPath(
                path = lightColoredPath,
                color = OrangeYellow1
            )
        }//Canvas
    }//BoxWithConstraints
}