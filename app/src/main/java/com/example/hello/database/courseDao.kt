package com.example.hello.database
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ke.co.hello.models.Course
interface courseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCourse(course: Course)

    @Query("SELECT * FROM courses")
    fun getAllCourses(): List<Course>
}