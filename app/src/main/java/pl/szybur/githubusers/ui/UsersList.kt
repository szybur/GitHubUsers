package pl.szybur.githubusers.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.szybur.githubusers.data.GitHubUser
import pl.szybur.githubusers.ui.theme.GitHubUsersTheme

@Composable
fun UsersList(
    users: List<GitHubUser>,
    onClick: (GitHubUser) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
        items(items = users) { item ->
            UserItem(user = item, modifier = modifier, onClick = {})
        }
    }
}

@Preview
@Composable
fun UsersListPreview() {
    GitHubUsersTheme {
        UsersList(users = listOf(
            GitHubUser(name = "Adam Słodowy"),
            GitHubUser(name = "Kapitan Żbik"),
            GitHubUser(name = "Smok Wawelski"),
        ),
            onClick = {})
    }
}
