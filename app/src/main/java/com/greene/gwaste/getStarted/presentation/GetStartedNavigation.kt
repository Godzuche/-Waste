package com.greene.gwaste.getStarted.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val getStartedRoute = "get_started_route"

fun NavGraphBuilder.getStartedScreen(
    navigateToAuthentication: () -> Unit,
) {
    composable(getStartedRoute) {
        GetStartedRoute(navigateToAuthentication = navigateToAuthentication)
    }
}