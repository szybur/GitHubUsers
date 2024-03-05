package pl.szybur.githubusers.dataapi


interface UsersRepository {
    fun getUsers(): List<GitHubUser>

    fun getUser(id: Int): UserDetails
}