package pl.szybur.githubusers.viemodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import pl.szybur.githubusers.data.UserDetails
import pl.szybur.githubusers.data.UsersRepository
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel@Inject constructor(
    savedStateHandle: SavedStateHandle,
    usersRepository: UsersRepository
): ViewModel() {

    private val detailsId: Int  = (savedStateHandle.get<String>("id")!!).toInt()

    private val _details = usersRepository.getUser(detailsId)
    val details: UserDetails
        get() = _details
}