package pl.szybur.githubusers.data.rest

import pl.szybur.githubusers.data.api.GithubUser
import retrofit2.Call
import retrofit2.http.GET

interface GithubApiService {
    @GET("users")
    fun listUsers(): Call<List<GithubUser>>
}