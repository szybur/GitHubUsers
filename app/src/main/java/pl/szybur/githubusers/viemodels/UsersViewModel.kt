package pl.szybur.githubusers.viemodels

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import pl.szybur.githubusers.data.api.GithubUser
import pl.szybur.githubusers.data.api.UsersRepository
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(
    usersRepository: UsersRepository
): ViewModel() {

    private val _users = usersRepository.getUsers().toMutableStateList()
    val users: List<GithubUser>
        get() = _users


}