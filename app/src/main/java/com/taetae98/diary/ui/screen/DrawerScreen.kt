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

object DrawerScreen : NavigationScreen {
    override val iconRes = R.drawable.ic_round_all_inbox_24
    override val labelRes = R.string.drawer
    override val route: String = "DrawerScreen"

    @Composable
    override fun Compose() {
        DrawerScreen()
    }
}

@Preview
@Composable
fun DrawerScreen(
    navController: NavHostController = rememberNavController()
) {
    Text(
        text = stringResource(R.string.drawer),
        modifier = Modifier.fillMaxSize()
    )
}