package com.sam43.material3mvvmca.di

import android.content.Context
import androidx.room.Room
import com.sam43.material3mvvmca.BuildConfig
import com.sam43.material3mvvmca.data.source.local.DB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDB(@ApplicationContext context: Context): DB =
        Room.databaseBuilder(
            context,
            DB::class.java,
            BuildConfig.DB_NAME
        ).build()
}