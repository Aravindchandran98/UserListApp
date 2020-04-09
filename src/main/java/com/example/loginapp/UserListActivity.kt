package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import org.json.JSONArray
import java.io.InputStream

class UserListActivity : AppCompatActivity() {
    private var listView: ListView? = null
    private var list: ArrayList<User> = ArrayList()
    private var adapter: Adapter? = null
    var image1 = R.drawable.iron_man
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)

        var json: String? = null
        val inputStream: InputStream = assets.open("UserDetails.json")
        json = inputStream.bufferedReader().use { it.readText() }
        var jsonarr = JSONArray(json)
        for (index in 0..jsonarr.length() - 1) {
            var jsonObj = jsonarr.getJSONObject(index)
            var n = jsonObj.getString("name")
            var p = jsonObj.getLong("phoneNumber")
            var a = jsonObj.getInt("age")
            var t = User(n, p, a)
            list!!.add(t)
        }
        adapter = Adapter(list!!, image1)
        listView!!.adapter=adapter
        //click listener for cards
        listView!!.setOnItemClickListener { adapterView, view, position, id ->
            var intent: Intent = Intent(this, UserDetailActivity::class.java)
            var positionVariable = adapterView.getItemIdAtPosition(position).toInt()
            for (index in list!!) {
                if (index.equals(positionVariable)) {
                    intent.putExtra("name", index.userName)
                    intent.putExtra("phoneNumber", index.userPhoneNumber)
                    intent.putExtra("age", index.userAge)
                }
            }
            startActivity(intent)
        }
    }
}
