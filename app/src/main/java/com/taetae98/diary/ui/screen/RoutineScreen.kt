package com.taetae98.diary.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.taetae98.diary.R
import com.taetae98.diary.prodocol.NavigationScreen

object RoutineScreen : NavigationScreen {
    override val iconRes = R.drawable.ic_round_repeat_24
    override val labelRes = R.string.routine
    override val route: String = "RoutineScreen"

    @Composable
    override fun Compose() {
        RoutineScreen()
    }
}

@Preview
@Composable
fun RoutineScreen(
    navController: NavHostController = rememberNavController()
) {
    Text(
        text = stringResource(R.string.routine),
        modifier = Modifier.fillMaxSize()
    )
}