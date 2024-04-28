package com.greene.gwaste

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.greene.gwaste.getStarted.presentation.getStartedRoute
import com.greene.gwaste.navigation.GWasteNavHost

@Composable
fun GWasteApp() {
    val navController = rememberNavController()
    GWasteNavHost(
        navController = navController,
        startDestination = getStartedRoute,
    )
}