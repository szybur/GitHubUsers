package pl.szybur.githubusers.data.api

import kotlinx.coroutines.flow.Flow


interface UsersRepository {
    fun getUsers(): Flow<Result<List<GithubUser>>>

    fun getUser(login: String): UserDetails
}