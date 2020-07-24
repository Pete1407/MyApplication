package com.example.myapplication.database

import android.content.Context
import androidx.room.*
import com.example.myapplication.model.StoryEnitiy

// เป็น class สำหรับการเรียกใช้ database เลย
@Database(entities = arrayOf(StoryEnitiy::class),version = 1)
abstract class AppDatabase : RoomDatabase() {
   abstract val studentDao : StoryDao

    companion object{
       @Volatile
       var INSTANCE : AppDatabase? = null

        fun getInstance(context : Context) : AppDatabase? {
            synchronized(this){
                var instance =
                    INSTANCE
                if(instance == null)
                {
                    instance = Room.databaseBuilder(context,
                        AppDatabase::class.java,"story_Database").fallbackToDestructiveMigration().build()
                    return INSTANCE
                }
            }
            return INSTANCE
        }
    }
}