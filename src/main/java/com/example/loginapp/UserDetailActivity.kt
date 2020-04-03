package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class UserDetailActivity : AppCompatActivity() {
    private var name: TextView? = null
    private var phoneNumber: TextView? = null
    private var age: TextView? = null
    private var list: ArrayList<User>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)
        //definition for objects
        name = findViewById(R.id.name)
        phoneNumber = findViewById(R.id.phoneNumber)
        age = findViewById(R.id.age)
        //arraylist
        var readJason: JsonReader = JsonReader()
        list = readJason.makeArray()
        name=intent.getStringExtra("name") as TextView
        phoneNumber=intent.getLongExtra("phoneNumber",0) as TextView
        age=intent.getIntExtra("age",0) as TextView


       /* var nameHolder=intent.getStringExtra("name")
        var phoneNumberHolder:Long=intent.getLongExtra("phoneNumber",0)
        var ageHolder:Int=intent.getIntExtra("age",0)
        name1.setText(nameHolder)
        phoneNumber1.set(phoneNumberHolder)
        age1.setText(ageHolder)*/

       /* var userList:UserList= list!![positionString]
        name.text = userList.userName
        phoneNumber.text = userList.userPhoneNumber.toString()
        age.text = userList.userAge.toString()*/


    }
}
