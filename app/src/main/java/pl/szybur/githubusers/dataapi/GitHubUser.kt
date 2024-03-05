package pl.szybur.githubusers.dataapi

data class GitHubUser (val id: Int = -1, val name: String)

data class UserDetails(val user: GitHubUser, val description: String)
