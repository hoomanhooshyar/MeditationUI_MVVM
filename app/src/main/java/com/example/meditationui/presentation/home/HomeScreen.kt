package com.example.meditationui.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.meditationui.R
import com.example.meditationui.presentation.home.components.ChipSections
import com.example.meditationui.presentation.home.components.CurrentMeditation
import com.example.meditationui.presentation.home.components.FeatureSection
import com.example.meditationui.presentation.home.components.GreetingSection
import com.example.meditationui.presentation.util.Feature
import com.example.meditationui.ui.theme.Beige1
import com.example.meditationui.ui.theme.Beige2
import com.example.meditationui.ui.theme.Beige3
import com.example.meditationui.ui.theme.BlueViolet1
import com.example.meditationui.ui.theme.BlueViolet2
import com.example.meditationui.ui.theme.BlueViolet3
import com.example.meditationui.ui.theme.LightGreen1
import com.example.meditationui.ui.theme.LightGreen2
import com.example.meditationui.ui.theme.LightGreen3
import com.example.meditationui.ui.theme.OrangeYellow1
import com.example.meditationui.ui.theme.OrangeYellow2
import com.example.meditationui.ui.theme.OrangeYellow3

@Composable
fun HomeScreen() {
        Column {
            GreetingSection()
            ChipSections(chips = listOf("Sweet sleep", "Insomnia", "Depression"))
            CurrentMeditation()
            FeatureSection(
                features = listOf(
                    Feature(
                        title = stringResource(id = R.string.sleep_meditation),
                        iconId = R.drawable.ic_headphone,
                        lightColor = BlueViolet1,
                        mediumColor = BlueViolet2,
                        darkColor = BlueViolet3
                    ),
                    Feature(
                        title = stringResource(id = R.string.tips_sleep),
                        iconId = R.drawable.ic_videocam,
                        lightColor = LightGreen1,
                        mediumColor = LightGreen2,
                        darkColor = LightGreen3
                    ),
                    Feature(
                        title = stringResource(id = R.string.night_island),
                        iconId = R.drawable.ic_headphone,
                        lightColor = OrangeYellow1,
                        mediumColor = OrangeYellow2,
                        darkColor = OrangeYellow3
                    ),
                    Feature(
                        title = stringResource(id = R.string.calming_sounds),
                        iconId = R.drawable.ic_headphone,
                        lightColor = Beige1,
                        mediumColor = Beige2,
                        darkColor = Beige3
                    )
                )
            )//FeatureSection
        }//Column
}
