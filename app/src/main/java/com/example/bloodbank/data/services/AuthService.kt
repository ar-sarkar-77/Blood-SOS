package com.example.bloodbank.data.services

import com.example.bloodbank.data.model.UserLogIn
import com.example.bloodbank.data.model.UserRegistration
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

interface AuthService {

    fun userRegistration(user: UserRegistration): Task<AuthResult>
    fun userLogin(user: UserLogIn) : Task<AuthResult>
    fun createUser(user: UserRegistration): Task<Void>
}