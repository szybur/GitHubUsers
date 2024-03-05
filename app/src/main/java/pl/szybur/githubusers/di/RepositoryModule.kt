package pl.szybur.githubusers.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import pl.szybur.githubusers.data.local.LocalRepository
import pl.szybur.githubusers.data.api.UsersRepository

@Module
@InstallIn(ViewModelComponent::class)
class RepositoryModule {

    private val repository = LocalRepository()
    @Provides
    fun provideUsersRepository() : UsersRepository = repository
}