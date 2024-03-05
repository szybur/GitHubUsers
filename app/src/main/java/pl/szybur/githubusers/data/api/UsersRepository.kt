package pl.szybur.githubusers.data.api


interface UsersRepository {
    fun getUsers(): List<GithubUser>

    fun getUser(login: String): UserDetails
}