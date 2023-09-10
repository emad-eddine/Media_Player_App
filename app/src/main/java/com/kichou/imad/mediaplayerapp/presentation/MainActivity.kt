package com.kichou.imad.mediaplayerapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.kichou.imad.mediaplayerapp.presentation.navigation.Navigation
import com.kichou.imad.mediaplayerapp.presentation.ui.theme.MediaPlayerAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MediaPlayerAppTheme {

                Surface (modifier = Modifier.fillMaxSize()){
                    Navigation()
                }

            }
        }
    }
}

