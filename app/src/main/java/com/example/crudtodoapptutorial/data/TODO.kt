package com.example.crudtodoapptutorial.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TODO(
    val title: String,
    val description: String?,
    val isDone: Boolean,
    @PrimaryKey val id: Int? = null
)
