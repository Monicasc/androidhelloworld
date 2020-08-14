package com.example.hello

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_course.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
        var coursesList= listOf<courses>()
        course(courseId "1",courseName "kotlin",courseCode "k001", instructor "John",description "mobile app")
        course(courseId "2", courseName "python",courseCode "p999", instructor "James",description "backend development")
        course(courseId "3", courseName "entreprenuership", courseCode "e5644",instructor "Kelly", description "intro to entreprenuership")
        course(courseId "4",courseName "graphic design",courseCode "gh0009", instructor "Nyandia",description "intro to graphid design")
        course(courseId "5", courseName "html/css",courseCode "hc945", instructor "Jeff",description "intro to html/css")
        course(courseId "6", courseName "professional development", courseCode "pd5777",instructor "Rodgers", description "intro to professional development")
        course(courseId "7",courseName "Navigting your journey",courseCode "ng0301", instructor "Veronica",description "navigating your journey")
        course(courseId "8", courseName "javascript",courseCode "js456", instructor "Purity",description "frontend development")
        course(courseId "9", courseName "hardware design", courseCode "hd788",instructor "Barre", description "intro to hardware design")
        course(courseId "10", courseName "hardware electronics", courseCode "he788",instructor "Barre", description "intro to hardware elctronics")
        rvCourses.LayoutManager =LinearLayoutManager(baseContext)
        rvCourses.adapter=coursesAdapter(coursesList)
        }
    }

}