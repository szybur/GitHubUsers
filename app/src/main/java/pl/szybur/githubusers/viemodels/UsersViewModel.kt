package pl.szybur.githubusers.viemodels

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import pl.szybur.githubusers.dataapi.GitHubUser
import pl.szybur.githubusers.dataapi.UsersRepository
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(
    usersRepository: UsersRepository
): ViewModel() {

    private val _users = usersRepository.getUsers().toMutableStateList()
    val users: List<GitHubUser>
        get() = _users


}