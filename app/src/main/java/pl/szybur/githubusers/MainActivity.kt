package pl.szybur.githubusers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pl.szybur.githubusers.data.getUsers
import pl.szybur.githubusers.ui.UsersList
import pl.szybur.githubusers.ui.theme.GitHubUsersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitHubUsersTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column {
        Text(text = "Github users")
        UsersList(users = getUsers())
    }

}