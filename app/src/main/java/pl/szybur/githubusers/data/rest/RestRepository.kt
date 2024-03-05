package pl.szybur.githubusers.data.rest

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

import kotlinx.coroutines.flow.flowOn
import pl.szybur.githubusers.data.api.GithubUser
import pl.szybur.githubusers.data.api.UserDetails
import pl.szybur.githubusers.data.api.UsersRepository

class RestRepository: UsersRepository {

    private val service = createGithubApiService()
    override fun getUsers(): Flow<Result<List<GithubUser>>> = flow {

        val response = service.listUsers().execute()
        if (response.isSuccessful) {
            emit(Result.success(response.body() ?: listOf()))
        } else {
            emit(Result.failure(Exception("cannot fetch users")))
        }
    }.flowOn(Dispatchers.IO)

    override fun getUser(login: String): UserDetails {
        TODO("Not yet implemented")
    }
}