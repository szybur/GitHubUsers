package pl.szybur.githubusers.data.rest

import pl.szybur.githubusers.data.api.GithubUser
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface GithubApiService {
    @GET("users")
    fun listUsers(): Call<List<GithubUser>>
}

fun createGithubApiService(): GithubApiService = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(GithubApiService::class.java)
