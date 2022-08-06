package com.sam43.material3mvvmca.data.source.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sam43.material3mvvmca.data.source.local.entity.Dummy
import kotlinx.coroutines.flow.Flow

@Dao
interface DummyDao {
    @Query("SELECT * FROM dummy")
    fun fetchAllItemsAsFlow(): Flow<List<Dummy>>

    @Query("SELECT * FROM dummy")
    fun fetchAllItems(): List<Dummy>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertItem(item: Dummy)
}