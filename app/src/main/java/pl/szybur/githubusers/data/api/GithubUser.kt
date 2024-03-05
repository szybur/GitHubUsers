package pl.szybur.githubusers.data.api

data class GithubUser(
    val login: String,
    val id: Long = -1
)

data class UserDetails(val user: GithubUser, val description: String)
