package pl.szybur.githubusers.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import pl.szybur.githubusers.data.LocalRepository
import pl.szybur.githubusers.dataapi.UsersRepository

@Module
@InstallIn(ViewModelComponent::class)
class RepositoryModule {

    private val repository = LocalRepository()
    @Provides
    fun provideUsersRepository() :UsersRepository = repository
}