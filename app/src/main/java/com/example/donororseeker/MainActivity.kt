package com.example.donororseeker

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun findService(view: View) {
        Log.d(TAG, "Find a service is called")
    }
    fun becomeDonor(view: View){
        Log.d(TAG, "Become a seller is called")
    }

    fun getOtp(view: View) {
        val i: Intent = Intent(this, VerifyOtp::class.java)
        startActivity(i)
    }
}