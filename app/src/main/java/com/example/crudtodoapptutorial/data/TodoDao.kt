package com.example.crudtodoapptutorial.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface TodoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: TODO)

    @Delete
    suspend fun deleteTodo(todo: TODO)

    @Query("SELECT * FROM todo WHERE id = :id ")
    suspend fun getTodoById(id: Int): TODO?

    @Query("SELECT * FROM todo")
    fun getTodos(): Flow<List<TODO>>
}