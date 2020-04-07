package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class UserDetailActivity : AppCompatActivity() {
    private var name: TextView? = null
    private var phoneNumber: TextView? = null
    private var age: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)
        //definition for objects
        name = findViewById(R.id.name)
        phoneNumber = findViewById(R.id.phoneNumber)
        age = findViewById(R.id.age)
        name = intent.getStringExtra("name") as TextView
        phoneNumber = intent.getLongExtra("phoneNumber", 0) as TextView
        age = intent.getIntExtra("age", 0) as TextView
    }
}
