

dependencies {
    implementation(libs.androidx.navigation.compose)
}


val navController = rememberNavController()

NavHost(navController = navController, startDestination = "FirstScreen") {
    composable("FirstScreen") {
        homeScreen()
    }
    composable("SecondScreen") {
        secondScreen(navController) Navegación entre botones1
    }
}

