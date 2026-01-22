package com.example.bloodbank

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

interface AuthService {

    fun userRegistration(user: UserRegistration): Task<AuthResult>
    fun userLogin(user: UserLogIn) : Task<AuthResult>
    fun createUser(user: UserRegistration): Task<Void>
}