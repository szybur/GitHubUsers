package pl.szybur.githubusers.data.rest

import pl.szybur.githubusers.data.api.GithubUser
import pl.szybur.githubusers.data.api.UserDetails
import pl.szybur.githubusers.data.api.UsersRepository

class RestRepository: UsersRepository {
    override fun getUsers(): List<GithubUser> {
        TODO("Not yet implemented")
    }

    override fun getUser(login: String): UserDetails {
        TODO("Not yet implemented")
    }
}