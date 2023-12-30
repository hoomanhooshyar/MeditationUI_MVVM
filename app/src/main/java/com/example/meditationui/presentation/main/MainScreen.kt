package com.example.meditationui.presentation.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.meditationui.R
import com.example.meditationui.presentation.home.HomeScreen
import com.example.meditationui.presentation.main.component.BottomMenu
import com.example.meditationui.presentation.meditate.MeditateScreen
import com.example.meditationui.presentation.music.MusicScreen
import com.example.meditationui.presentation.profile.ProfileScreen
import com.example.meditationui.presentation.sleep.SleepScreen
import com.example.meditationui.presentation.util.BottomMenuContent
import com.example.meditationui.ui.theme.DeepBlue

@Composable
fun MainScreen() {
    Box(modifier = Modifier
        .background(DeepBlue)
        .fillMaxSize()
        .padding(top = 24.dp)
    ){

        val selectedMenuItem = BottomMenuContent(
            title = stringResource(id = R.string.home),
            iconId = 0
        )
        var selectedItem:BottomMenuContent by remember{
            mutableStateOf(selectedMenuItem)
        }
        when(selectedItem.title){
            stringResource(id = R.string.home) ->{
                HomeScreen()
            }
            stringResource(id = R.string.meditate) ->{
                MeditateScreen()
            }
            stringResource(id = R.string.sleep) ->{
                SleepScreen()
            }
            stringResource(id = R.string.music) ->{
                MusicScreen()
            }
            stringResource(id = R.string.profile) ->{
                ProfileScreen()
            }

        }
        BottomMenu(
            items = listOf(
                BottomMenuContent(
                    title = stringResource(id = R.string.home),
                    iconId = R.drawable.ic_home
                ),
                BottomMenuContent(
                    title = stringResource(id = R.string.meditate),
                    iconId = R.drawable.ic_bubble
                ),
                BottomMenuContent(
                    title = stringResource(id = R.string.sleep),
                    iconId = R.drawable.ic_moon
                ),
                BottomMenuContent(
                    title = stringResource(id = R.string.music),
                    iconId = R.drawable.ic_music
                ),
                BottomMenuContent(
                    title = stringResource(id = R.string.profile),
                    iconId = R.drawable.ic_profile
                ),
            ),
            modifier = Modifier.align(Alignment.BottomCenter)
        ){
            selectedItem = it
        }
    }//BOX
}