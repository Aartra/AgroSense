package com.bangkitacademy.agrosense.data.remote.response

data class RegisterRequest(
    val username: String,
    val email: String,
    val password: String
)