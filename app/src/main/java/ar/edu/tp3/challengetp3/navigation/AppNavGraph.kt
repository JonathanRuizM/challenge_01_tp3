package ar.edu.tp3.challengetp3.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ar.edu.tp3.challengetp3.ui.screens.home.HomeScreen
import ar.edu.tp3.challengetp3.ui.screens.login.LoginScreen
import ar.edu.tp3.challengetp3.ui.screens.register.RegisterScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {
        composable(Routes.HOME) {
            HomeScreen(
                onLoginClick = {
                    navController.navigate(Routes.LOGIN)
                },
                onRegisterClick = {
                    navController.navigate(Routes.REGISTER)
                }
            )
        }

        composable(Routes.LOGIN) {
            LoginScreen(
                onCreateAccountClick = {
                    navController.navigate(Routes.REGISTER)
                }
            )
        }

        composable(Routes.REGISTER) {
            RegisterScreen(
                onLoginClick = {
                    navController.navigate(Routes.LOGIN)
                }
            )
        }
    }
}