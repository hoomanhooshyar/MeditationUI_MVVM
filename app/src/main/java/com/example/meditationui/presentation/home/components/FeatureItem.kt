package com.example.meditationui.presentation.home.components

import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meditationui.R
import com.example.meditationui.presentation.util.Feature
import com.example.meditationui.presentation.util.standardQuadFromTo
import com.example.meditationui.ui.theme.ButtonBlue
import com.example.meditationui.ui.theme.TextWhite

@Composable
fun FeatureItem(
    feature: Feature,
    modifier: Modifier = Modifier
) {
    BoxWithConstraints(
        modifier = modifier
            .background(feature.darkColor)
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
                color = feature.mediumColor
            )
            drawPath(
                path = lightColoredPath,
                color = feature.lightColor
            )
        }//Canvas
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ){
            Text(
                text = feature.title,
                style = MaterialTheme.typography.titleMedium,
                lineHeight = 26.sp,
                modifier = Modifier.align(Alignment.TopStart)
            )
            Icon(
                painter = painterResource(id = feature.iconId),
                contentDescription = feature.title,
                tint = Color.White,
                modifier = Modifier.align(Alignment.BottomStart)
            )
            Text(
                text = stringResource(id = R.string.start),
                color = TextWhite,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable {
                        Log.i("TAG","Handle Click for Text")
                    }
                    .align(Alignment.BottomEnd)
                    .clip(RoundedCornerShape(10.dp))
                    .background(ButtonBlue)
                    .padding(vertical = 6.dp, horizontal = 15.dp)
            )
        }//Box
    }//BoxWithConstraints
}