package com.EimyCB.klx_assessment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.EimyCB.klx_assessment.ui.theme.KLx_AssessmentTheme
import com.eimycb.ui.screen.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KLx_AssessmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoadScreens()
                }
            }
        }
    }
}

@Composable
fun LoadScreens() {
    HomeScreen()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KLx_AssessmentTheme {
        LoadScreens()
    }
}