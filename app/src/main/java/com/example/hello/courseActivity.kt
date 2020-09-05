package com.example.hello

import android.os.Bundle
import android.preference.PreferenceManager.getDefaultSharedPreferences
import android.widget.Toast
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
        fun fetchCourses(){
            val sharedPreferences = getDefaultSharedPreferences(baseContext)
            val acessToken = sharedPreferences.getString(key:"ACCESS_TOKEN_KET","defValue")
            val apiClient = ApiClient.buildService(ApiInterface::class.java)
            val coursesCall = apiClient.let("Bearer " + accessToken)
            coursesCall.enqueue(object : Callback<CoursesResponse> {
                override fun onFailure(call: Call<CoursesResponse>, t: Throwable) {
                    val baseContext
                    Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
        }

                 override fun onResponse(
                     call: Call<CoursesResponse>
                     response: Response<CoursesResponse>
                 ) {
                     if(response.isSuccessful){
                         var coursesList = response.body?.courses as List<Course>
                         var coursesAdapter = CoursesAdapter(courseList)
                         val rvCourses
                         rvCourses.layoutManager = LinearLayoutManager(baseContext)
                         rvCourses.adapter = coursesAdapter
                     } else {
                         Toast.makeText(baseContext, response.errorBody().toString(), Toast.LENGTH_LONG)
                             .show()
                     }
                 }
            })
        }
}
 fun fetchCoursesFromDatabase()
   Thread{
    val courses = database.courseDoo().getAllCourses()
     runOnUi Threads{
         displayCourses(courses)
     }
}.start()

}
  fun displayCourses(courses:list<(Courses))>{
    var coursesAdapter = CoursesAdapter(courses)
    rvCourseslayoutManager = LinearLayoutManager(courses)
    rvCourses.adpater = coursesAdpter
}
   }