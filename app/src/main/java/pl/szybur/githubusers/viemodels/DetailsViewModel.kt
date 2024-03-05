package pl.szybur.githubusers.viemodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import pl.szybur.githubusers.data.api.UserDetails
import pl.szybur.githubusers.data.api.UsersRepository
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel@Inject constructor(
    savedStateHandle: SavedStateHandle,
    usersRepository: UsersRepository
): ViewModel() {

    private val login: String  = savedStateHandle.get<String>("login")!!

    private val _details = usersRepository.getUser(login)
    val details: UserDetails
        get() = _details
}