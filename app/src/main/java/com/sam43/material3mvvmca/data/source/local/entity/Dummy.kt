package com.sam43.material3mvvmca.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dummy")
data class Dummy(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String
)
