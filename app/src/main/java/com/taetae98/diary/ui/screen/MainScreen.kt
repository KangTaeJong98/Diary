package com.taetae98.diary.ui.screen

import android.util.Log
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.taetae98.diary.prodocol.NavigationScreen

@Preview
@Composable
fun MainScreen(
    navController: NavHostController = rememberNavController()
) {
    val screenList = listOf(
        ToDoScreen, DrawerScreen
    )

    Scaffold(
        bottomBar = {
            BottomNavigation(screenList = screenList, navController = navController)
        }
    ) {
        NavHost(screenList = screenList, navController = navController)
    }
}

@Composable
private fun NavHost(
    screenList: List<NavigationScreen>,
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = screenList.first().route) {
        screenList.forEach { screen ->
            composable(screen.route) {
                screen.Compose()
            }
        }
    }
}

@Composable
private fun BottomNavigation(
    screenList: List<NavigationScreen>,
    navController: NavHostController
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    BottomNavigation {
        screenList.forEach { screen ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = screen.iconRes),
                        contentDescription = stringResource(
                            id = screen.labelRes
                        )
                    )
                },
                label = { Text(text = stringResource(id = screen.labelRes)) },
                selected = screen.route == currentRoute,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id)
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
