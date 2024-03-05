package pl.szybur.githubusers.data.api

import pl.szybur.githubusers.data.api.GitHubUser
import pl.szybur.githubusers.data.api.UserDetails


interface UsersRepository {
    fun getUsers(): List<GitHubUser>

    fun getUser(login: String): UserDetails
}