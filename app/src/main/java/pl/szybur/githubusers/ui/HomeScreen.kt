package pl.szybur.githubusers.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import pl.szybur.githubusers.data.api.GithubUser
import pl.szybur.githubusers.viemodels.UsersViewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onClick: (GithubUser) -> Unit,
) {
    val usersViewModel: UsersViewModel = hiltViewModel()
    val scope = rememberCoroutineScope()
    val usersResult = usersViewModel.users.collectAsState(
        initial = Result.success(listOf()),
        scope.coroutineContext
    ).value

    Column {
        if (usersResult.isSuccess) {
            val users = usersResult.getOrDefault(listOf())
            Text(text = "Github users (${users.size} fetched)", modifier = modifier)
            UsersList(
                users = users,
                onClick = onClick,
                modifier = modifier
            )
        } else {
            Text(text = "error fetching users", modifier = modifier)
        }
    }
}