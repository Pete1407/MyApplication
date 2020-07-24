package com.example.myapplication.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.model.StoryEnitiy

// LiveData สามารถนำข้อมูลที่ได้ไปใช้กับ ViewModel ได้เลย
@Dao
interface StoryDao {

    @Insert
    fun addStory(newStory : StoryEnitiy)

    @Query("SELECT * FROM Story")
    fun getAllStory()

    @Query("DELETE FROM Story")
    fun clearAllStory()
}