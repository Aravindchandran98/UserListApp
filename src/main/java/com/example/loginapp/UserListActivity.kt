package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class UserListActivity : AppCompatActivity() {
    private var listView: ListView? = null
    private var list: ArrayList<User>? = null
    private var adapter: Adapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        var jsonReader: JsonReader = JsonReader()
        list = jsonReader.makeArray()
        adapter = Adapter(this, list!!)
        listView!!.adapter = adapter
        //click listener for cards
        listView!!.setOnItemClickListener()
        { adapterView, view, position, id ->
            var intent: Intent = Intent(this, UserDetailActivity::class.java)
            var positionVariable = adapterView.getItemIdAtPosition(position).toInt()
           // intent.putExtra("position", positionVariable)
            for (index in list!!) {
                if (index .equals(positionVariable)){
                    intent.putExtra("name",index.userName)
                    intent.putExtra("phoneNumber",index.userPhoneNumber)
                    intent.putExtra("age",index.userAge)
                }
            }
            startActivity(intent)
        }
    }
}
