package com.example.hello

import retrofit2.http.GET

class ApiInterface {
    import okhttp3.RequestBody
    import retrofit2.Call
    import retrofit2.http.Body
    import retrofit2.http.POST


    interface ApiInterface {
        @POST("register")
        fun registerStudent(@Body requestBody: RequestBody): Call<RegistrationResponse>
        @POST("login")
        fun loginStudent(@Body requestBody: RequestBody): Call<RegistrationResponse>
        @GET("course")
        fun getCourses(@Header("Authorization") accessToken: String): Call<CoursesResponse>
    }
}
