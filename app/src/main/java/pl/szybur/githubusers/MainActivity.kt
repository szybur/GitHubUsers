package pl.szybur.githubusers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import dagger.hilt.android.AndroidEntryPoint
import pl.szybur.githubusers.ui.GitHubUsersApp
import pl.szybur.githubusers.ui.UsersList
import pl.szybur.githubusers.ui.theme.GitHubUsersTheme
import pl.szybur.githubusers.viemodels.UsersViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitHubUsersTheme {
                GitHubUsersApp()
            }
        }
    }
}

