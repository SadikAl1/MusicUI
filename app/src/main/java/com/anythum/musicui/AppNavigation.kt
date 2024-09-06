package com.anythum.musicui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.anythum.musicui.ui.screens.SongDetail
import com.anythum.musicui.ui.screens.SongsScreen

@Composable
fun MusicUI(modifier: Modifier = Modifier) {
    val nc = rememberNavController()

    NavHost(navController = nc, startDestination = "main") {

        composable("main") { backStackEntry ->
            val enterTransition = slideInVertically(initialOffsetY = { fullHeight -> fullHeight })
            val exitTransition = slideOutVertically(targetOffsetY = { fullHeight -> -fullHeight })

            AnimatedVisibility(
                visible = true,
                enter = enterTransition,
                exit = exitTransition
            ) {
                SongsScreen {
                    nc.navigate("detail/${it}")
                }
            }
        }
        composable("detail/{songId}", arguments = listOf(navArgument("songId") { type = NavType.IntType })) { backStackEntry ->
            val songId = backStackEntry.arguments?.getInt("songId") ?: return@composable
            SongDetail(songId = songId) {
                nc.popBackStack()
            }
        }
    }
}
