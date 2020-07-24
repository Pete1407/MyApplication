package com.example.myapplication.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// ถ้าไม่ได้กำหนดชื่อ tableName ก็จะกำหนดเป็นชื่อ class เอง by default
// @PrimaryKey เป็น annotation บอกว่าเราจะกำหนด field นี้เป็น key ของ table นี้
// @ColumnInfo เป็น annotation บอกว่าเราจะกำหนดชื่อ field ให้ตรงกับ table ในฐานข้อมูล
@Entity(tableName = "Story")
data class StoryEnitiy(
    @PrimaryKey(autoGenerate = true)
    var idStory : Long = 0L,

    @ColumnInfo(name = "storyOfUser")
    var storyofUser : String,

    @ColumnInfo(name = "dayTime")
    var dayTime : Long,

    @ColumnInfo(name = "emotion")
    var emotion : String

)