import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.nikdev.composelessons.navigation.HOME_GRAPH_ROUTE
import com.nikdev.composelessons.navigation.ROOT_GRAPH_ROUTE
import com.nikdev.composelessons.navigation.nav_graph.authNavGraph
import com.nikdev.composelessons.navigation.nav_graph.homeNavGraph

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ) {
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}