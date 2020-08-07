package com.example.hello

import CoursesRecyclerViewAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

data class Courses(val course_id: String, val course_name: Int, val course_code: Int, val course_instructor:String,val course_description:String)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCourses.layoutManager = LinearLayoutManager(baseContext)
        val coursesAdapter = CoursesRecyclerViewAdapter(coursesList = listOf(
            Courses(course_id:2,course_name:"javascript",course_code:0978,course_instructor:"Purity",course_description:"web development")
            Courses(course_id:5,course_name:"python",course_code:0098,course_instructor:"James",course_description:"backend development")
            Courses(course_id:3,course_name:"grapic design"course_code:8877,course_instructor:"Nyandia",course_description:"UI/UX design")
            Courses(course_id:6,course_name:"kotlin"course_code:8765,course_instructor:"John",course_description:"mobile development")
            Courses(course_id:8,cousre_name:"professional development",)Courses(course_id:2,course_name:"javascript",course_code:0978,course_instructor:"Purity",course_description:"web development")
            Courses(course_id:1,course_name:"navigating your journey",course_code:0000,course_instructor:"Veronica",course_description:"navigating your journey)
            Courses(course_id:10,course_name:"hardware design"course_code:666,course_instructor:"Barre",course_description:"hardware design")
            Courses(course_id:20,course_name:"hardware electronics"course_code:7765,course_instructor:"Barre",course_description:"hardware eletronics")
            Courses(course_id:23,cousre_name:"html/css",course_code:999,course_instructor:"Jeff",course_description:"UI/UI development")
            Courses(course_id:7,cousre_name:"entreprenuership",course)_code:8875,course_instructor:"Kelly",course_description"entrprenuership")

        )
        rvCourses.adapter=coursesAdapter
    }

}