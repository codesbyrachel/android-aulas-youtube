package com.codesbyrachel.aula02_mainthread

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.codesbyrachel.aula02_mainthread.ui.theme.Aula02MainThreadTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aula02MainThreadTheme {

            }
        }
    }
}
