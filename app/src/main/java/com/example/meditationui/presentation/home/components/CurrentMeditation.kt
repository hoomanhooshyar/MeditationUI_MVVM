package com.example.meditationui.presentation.home.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.meditationui.R
import com.example.meditationui.ui.theme.ButtonBlue
import com.example.meditationui.ui.theme.LightRed
import com.example.meditationui.ui.theme.TextWhite

@Composable
fun CurrentMeditation(
    color: Color = LightRed
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = stringResource(id = R.string.daily_thought),
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = stringResource(id = R.string.meditation_title),
                style = MaterialTheme.typography.bodyLarge,
                color = TextWhite
            )
        }//Column
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(ButtonBlue)
                .padding(10.dp)
        ) {
            IconButton(onClick = {
                Log.i("TAG", "Play music")
            }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_play),
                    contentDescription = "play",
                    tint = Color.White,
                    modifier = Modifier.size(16.dp)
                )
            }
        }
    }//Row
}