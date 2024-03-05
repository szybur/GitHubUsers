package pl.szybur.githubusers.data.api

data class GitHubUser (val id: Long = -1L, val login: String)

data class UserDetails(val user: GitHubUser, val description: String)
