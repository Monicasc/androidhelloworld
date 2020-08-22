package com.example.hello

data class LoginResponse {
    @serializedName("access_token") var accessToken:string,
    @SerializedName("message") var message: String
}