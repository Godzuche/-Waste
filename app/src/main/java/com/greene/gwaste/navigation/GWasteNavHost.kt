package com.greene.gwaste.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.greene.gwaste.getStarted.presentation.getStartedRoute
import com.greene.gwaste.getStarted.presentation.getStartedScreen

@Composable
fun GWasteNavHost(
    modifier: Modifier = Modifier,
    startDestination: String = getStartedRoute,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        getStartedScreen {
            // Todo: Use navController to navigate to SignUp here }
        }
    }
}