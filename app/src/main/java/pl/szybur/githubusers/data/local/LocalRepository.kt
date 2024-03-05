package pl.szybur.githubusers.data.local

import pl.szybur.githubusers.data.api.GitHubUser
import pl.szybur.githubusers.data.api.UserDetails
import pl.szybur.githubusers.data.api.UsersRepository

class LocalRepository : UsersRepository {

    private val users = listOf(
        UserDetails(
            GitHubUser(0, "Johny_Bravo"),
            "Cartoon Network"
        ),
        UserDetails(
            GitHubUser(1, "Clark_Kent"),
            "DC Comics"
        ),
        UserDetails(
            GitHubUser(2, "Luke_Skywalker"),
            "Star Wars"
        ),
        UserDetails(
            GitHubUser(3, "Kristen_Sheppard"),
            "Mass Effect"
        ),
        UserDetails(
            GitHubUser(4, "Johny_Mnemonic"),
            "Cyberpunk"
        ),
        UserDetails(
            GitHubUser(5, "Bruce_Wayne"),
            "DC Comics"
        ),
        UserDetails(
            GitHubUser(6, "Malcolm_Reynolds"),
            "Firefly"
        ),
        UserDetails(
            GitHubUser(7, "Gurney_Halleck"),
            "Dune"
        ),
        UserDetails(
            GitHubUser(8, "River_Tam"),
            "Firefly"
        ),
        UserDetails(
            GitHubUser(9, "Guy_Gardner"),
            "DC Comics"
        ),
        UserDetails(
            GitHubUser(10, "Vladimir_Harkonnen"),
            "Dune"
        ),
        UserDetails(
            GitHubUser(11, "Jack_Samurai"),
            "Cartoon Network"
        ),
        UserDetails(
            GitHubUser(12, "Sheldon_Cooper"),
            "Big Bang Theory"
        ),
        UserDetails(
            GitHubUser(13, "Ron_Swanson"),
            "Parks and Rec"
        ),
        UserDetails(
            GitHubUser(14, "Lois_Lane"),
            "DC Comics"
        ),
        UserDetails(
            GitHubUser(15, "Damien_Wayne"),
            "DC Comics"
        ),
        UserDetails(
            GitHubUser(16, "Duncan_Idaho"),
            "Dune"
        ),
        UserDetails(
            GitHubUser(17, "Peter_Quill"),
            "MCU"
        ),
        UserDetails(
            GitHubUser(18, "Simon_Tam"),
            "Firefly"
        ),
    )

    override fun getUsers(): List<GitHubUser> = users.map { it.user }

    override fun getUser(login: String): UserDetails = users.first { it.user.login == login }
}