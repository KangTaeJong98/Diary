package com.taetae98.diary.prodocol

import androidx.compose.runtime.Composable

interface NavigationScreen {
    val iconRes: Int
    val labelRes: Int
    val route: String

    @Composable
    fun Compose()
}