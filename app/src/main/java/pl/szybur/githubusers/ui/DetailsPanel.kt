package pl.szybur.githubusers.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.szybur.githubusers.data.api.GithubUser
import pl.szybur.githubusers.data.api.UserDetails
import pl.szybur.githubusers.ui.theme.GitHubUsersTheme

@Composable
fun DetailsPanel(
    details: UserDetails,
    modifier: Modifier = Modifier
) {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp),
    ) {
        Column {
            Text(
                text = details.user.login,
                modifier = modifier.padding(4.dp)
            )
            Text(text = details.description)
        }

    }
}

@Preview
@Composable
fun DetailsPanelPreview() {
    GitHubUsersTheme {
        DetailsPanel(details = UserDetails(
            user = GithubUser(login = "Paul_Atreides"),
            description = "Lisan Al Gaib"
        )
        )
    }
}