package com.sam43.material3mvvmca.data.source.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sam43.material3mvvmca.BuildConfig
import com.sam43.material3mvvmca.data.source.local.dao.DummyDao
import com.sam43.material3mvvmca.data.source.local.entity.Dummy
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


/**
 * Room DB version and migrations. Initially LAST_VERSION will be used only
 * Additionally, Migration is needed only when any changes made in table, columns etc. at runtime with production
 * auto migration applies when version need to be updated for the production
 * Use: autoMigrations = [AutoMigration (from = 1, to = 2)] as annotation params
  */
@Database(
    entities = [Dummy::class], version = 1, exportSchema = false
)
abstract class DB: RoomDatabase() {
    abstract val dummyDao: DummyDao
}