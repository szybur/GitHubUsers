package pl.szybur.githubusers.viemodels

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import pl.szybur.githubusers.data.api.GithubUser
import pl.szybur.githubusers.data.api.UsersRepository
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(
    usersRepository: UsersRepository
): ViewModel() {

    private val _users: Flow<Result<List<GithubUser>>> =
        usersRepository.getUsers()
    val users: Flow<Result<List<GithubUser>>>
        get() = _users


}