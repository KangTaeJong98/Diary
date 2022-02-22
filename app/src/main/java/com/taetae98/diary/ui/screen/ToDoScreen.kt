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

object ToDoScreen : NavigationScreen {
    override val iconRes = R.drawable.ic_round_check_24
    override val labelRes = R.string.to_do
    override val route: String = "ToDoScreen"

    @Composable
    override fun Compose() {
        ToDoScreen()
    }
}

@Preview
@Composable
fun ToDoScreen(
    navController: NavHostController = rememberNavController()
) {
    Text(
        text = stringResource(R.string.to_do),
        modifier = Modifier.fillMaxSize()
    )
}