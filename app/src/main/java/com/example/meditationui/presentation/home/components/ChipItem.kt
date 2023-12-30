package com.example.meditationui.presentation.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.meditationui.ui.theme.TextWhite

@Composable
fun ChipItem(
    chipName:String,
    modifier: Modifier = Modifier,
    onClick:() -> Unit
) {
    Box(
        modifier = modifier.clickable {
            onClick()
        },
        contentAlignment = Alignment.Center
    ){
        Text(
            text = chipName,
            color = TextWhite
        )
    }
}