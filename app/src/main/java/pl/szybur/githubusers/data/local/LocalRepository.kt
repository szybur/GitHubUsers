package pl.szybur.githubusers.data.local

import pl.szybur.githubusers.data.api.GithubUser
import pl.szybur.githubusers.data.api.UserDetails
import pl.szybur.githubusers.data.api.UsersRepository

class LocalRepository : UsersRepository {

    private val users = listOf(
        UserDetails(
            GithubUser(id = 0, login = "Johny_Bravo"),
            "Cartoon Network"
        ),
        UserDetails(
            GithubUser(id = 1, login = "Clark_Kent"),
            "DC Comics"
        ),
        UserDetails(
            GithubUser(id = 2, login = "Luke_Skywalker"),
            "Star Wars"
        ),
        UserDetails(
            GithubUser(id = 3, login = "Kristen_Sheppard"),
            "Mass Effect"
        ),
        UserDetails(
            GithubUser(id = 4, login = "Johny_Mnemonic"),
            "Cyberpunk"
        ),
        UserDetails(
            GithubUser(id = 5, login = "Bruce_Wayne"),
            "DC Comics"
        ),
        UserDetails(
            GithubUser(id = 6, login = "Malcolm_Reynolds"),
            "Firefly"
        ),
        UserDetails(
            GithubUser(id = 7, login = "Gurney_Halleck"),
            "Dune"
        ),
        UserDetails(
            GithubUser(id = 8, login = "River_Tam"),
            "Firefly"
        ),
        UserDetails(
            GithubUser(id = 9, login = "Guy_Gardner"),
            "DC Comics"
        ),
        UserDetails(
            GithubUser(id = 10, login = "Vladimir_Harkonnen"),
            "Dune"
        ),
        UserDetails(
            GithubUser(id = 11, login = "Jack_Samurai"),
            "Cartoon Network"
        ),
        UserDetails(
            GithubUser(id = 12, login = "Sheldon_Cooper"),
            "Big Bang Theory"
        ),
        UserDetails(
            GithubUser(id = 13, login = "Ron_Swanson"),
            "Parks and Rec"
        ),
        UserDetails(
            GithubUser(id = 14, login = "Lois_Lane"),
            "DC Comics"
        ),
        UserDetails(
            GithubUser(id = 15, login = "Damien_Wayne"),
            "DC Comics"
        ),
        UserDetails(
            GithubUser(id = 16, login = "Duncan_Idaho"),
            "Dune"
        ),
        UserDetails(
            GithubUser(id = 17, login = "Peter_Quill"),
            "MCU"
        ),
        UserDetails(
            GithubUser(id = 18, login = "Simon_Tam"),
            "Firefly"
        ),
    )

    override fun getUsers(): List<GithubUser> = users.map { it.user }

    override fun getUser(login: String): UserDetails = users.first { it.user.login == login }
}