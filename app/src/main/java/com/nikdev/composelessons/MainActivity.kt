package com.nikdev.composelessons

import SetupNavGraph
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nikdev.composelessons.ui.theme.ComposeLessonsTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLessonsTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}