package com.example.bloodbank

import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.QuerySnapshot


interface UserService {
    fun userDetails(user: UserInfo): Task<Void>
    fun bloodRequest(user: BloodRequest):Task<Void>
    fun getBloodRequestByUserID(userID : String): Task<QuerySnapshot>
    fun getAllRequest(): Task<QuerySnapshot>
    fun getAllDoner(): Task<QuerySnapshot>
    fun userDetailsByUserID(userID : String): Task<QuerySnapshot>
    fun updateUser(userID: String, data: Map<String, Any>):Task<Void>
}