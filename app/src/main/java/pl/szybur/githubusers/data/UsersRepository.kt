package pl.szybur.githubusers.data

import javax.inject.Inject

class UsersRepository @Inject constructor() {

    private val users = listOf(
        UserDetails(
            GitHubUser(0, "Johny Bravo"),
            "Cartoon Network"
        ),
        UserDetails(
            GitHubUser(1, "Clark Kent"),
            "DC Comics"
        ),
        UserDetails(
            GitHubUser(2, "Luke Skywalker"),
            "Star Wars"
        ),
        UserDetails(
            GitHubUser(3, "Kristen Sheppard"),
            "Mass Effect"
        ),
        UserDetails(
            GitHubUser(4, "Johny Mnemonic"),
            "Cyberpunk"
        ),
        UserDetails(
            GitHubUser(5, "Bruce Wayne"),
            "DC Comics"
        ),
        UserDetails(
            GitHubUser(6, "Malcolm Reynolds"),
            "Firefly"
        ),
        UserDetails(
            GitHubUser(7, "Gurney Halleck"),
            "Dune"
        ),
        UserDetails(
            GitHubUser(8, "River Tam"),
            "Firefly"
        ),
        UserDetails(
            GitHubUser(9, "Guy Gardner"),
            "DC Comics"
        ),
        UserDetails(
            GitHubUser(10, "Vladimir Harkonnen"),
            "Dune"
        ),
        UserDetails(
            GitHubUser(11, "Jack Samurai"),
            "Cartoon Network"
        ),
        UserDetails(
            GitHubUser(12, "Sheldon Cooper"),
            "Big Bang Theory"
        ),
        UserDetails(
            GitHubUser(13, "Ron Swanson"),
            "Parks and Rec"
        ),
        UserDetails(
            GitHubUser(14, "Lois Lane"),
            "DC Comics"
        ),
        UserDetails(
            GitHubUser(15, "Damien Wayne"),
            "DC Comics"
        ),
        UserDetails(
            GitHubUser(16, "Duncan Idaho"),
            "Dune"
        ),
        UserDetails(
            GitHubUser(17, "Peter Quill"),
            "MCU"
        ),
        UserDetails(
            GitHubUser(18, "Simon Tam"),
            "Firefly"
        ),
    )

    fun getUsers(): List<GitHubUser> = users.map { it.user }
}