package com.example.englishtutor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.englishtutor.ui.AppScaffold
import com.example.englishtutor.ui.theme.EnglishTutorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EnglishTutorTheme {
                AppScaffold()
            }
        }
    }
}
