package pl.szybur.githubusers.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.szybur.githubusers.data.GitHubUser
import pl.szybur.githubusers.ui.theme.GitHubUsersTheme

@Composable
fun UserItem(user: GitHubUser, modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Text(text = user.name)
    }
}

@Preview
@Composable
fun UserItemPreview() {
    GitHubUsersTheme {
        UserItem(user = GitHubUser("Johny Mnemonic"))
    }
}