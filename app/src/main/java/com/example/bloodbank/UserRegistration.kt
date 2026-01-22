package com.example.bloodbank

data class UserRegistration(
    val name : String,
    val email : String,
    val password : String,
    var userID : String,
)