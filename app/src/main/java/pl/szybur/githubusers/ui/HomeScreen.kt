package pl.szybur.githubusers.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import pl.szybur.githubusers.dataapi.GitHubUser
import pl.szybur.githubusers.viemodels.UsersViewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onClick: (GitHubUser) -> Unit,
) {
    val usersViewModel: UsersViewModel = hiltViewModel()
    Column {
        Text(text = "Github users", modifier = modifier)
        UsersList(
            users = usersViewModel.users,
            onClick = onClick,
            modifier = modifier
        )
    }
}