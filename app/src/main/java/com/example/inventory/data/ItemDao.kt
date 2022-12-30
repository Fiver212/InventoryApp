package com.example.inventory.data

import androidx.room.*

@Dao
interface ItemDao {

    @Insert
    suspend fun insert(item: Item)

    @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)

    @Query

}