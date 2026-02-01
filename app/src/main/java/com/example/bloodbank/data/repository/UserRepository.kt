package com.example.bloodbank.data.repository

import com.example.bloodbank.data.model.BloodRequest
import com.example.bloodbank.data.model.UserInfo
import com.example.bloodbank.core.Nodes
import com.example.bloodbank.data.services.UserService
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import jakarta.inject.Inject

class UserRepository @Inject constructor(
    private val db: FirebaseFirestore
) : UserService {
    override fun userDetails(user: UserInfo): Task<Void> {
        return db.collection(Nodes.USERINFO).document(user.userID).set(user)
    }

    override fun bloodRequest(user: BloodRequest): Task<Void> {
        return db.collection(Nodes.BLOOD_REQUEST).document().set(user)
    }

    override fun getBloodRequestByUserID(userID: String): Task<QuerySnapshot> {
        return db.collection(Nodes.BLOOD_REQUEST).whereEqualTo("userID", userID).get()
    }

    override fun getAllRequest(): Task<QuerySnapshot> {
        return db.collection(Nodes.BLOOD_REQUEST).get()
    }

    override fun getAllDoner(): Task<QuerySnapshot> {
        return db.collection(Nodes.USERINFO).get()
    }

    override fun userDetailsByUserID(userID: String): Task<QuerySnapshot> {
        return db.collection(Nodes.USERINFO).whereEqualTo("userID", userID).get()
    }

    override fun updateUser(userID: String, data: Map<String, Any>): Task<Void> {
        return db.collection(Nodes.USERINFO).document(userID).update(data)
    }

}