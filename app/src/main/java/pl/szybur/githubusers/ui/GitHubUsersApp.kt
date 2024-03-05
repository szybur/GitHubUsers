package pl.szybur.githubusers.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun GitHubUsersApp() {
    val navController = rememberNavController()
    GitHubUsersNavHost(navController = navController)
    //HomeScreen(onClick = {})
}

@Composable
fun GitHubUsersNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            HomeScreen(onClick = {
                navController.navigate(
                    Screen.Details.createRoute(it.login)
                )
            })
        }
        composable(
            route = Screen.Details.route,
            arguments = Screen.Details.navArguments
        ) {
            DetailsScreen()
        }
    }
}