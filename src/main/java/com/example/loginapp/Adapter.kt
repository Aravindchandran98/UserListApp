package com.example.loginapp

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter(val list: ArrayList<User>, var image1: Int) : BaseAdapter() {
    override fun getItem(position: Int): Any {
        return list!!.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list!!.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertViewHolder = convertView
        if (convertViewHolder == null) {
            if (parent != null) {
                convertViewHolder = View.inflate(parent.context, R.layout.user_card, null)
            }
        }
        var name: TextView = convertViewHolder!!.findViewById(R.id.name)
        var phoneNumber: TextView = convertViewHolder!!.findViewById(R.id.phoneNumber)
        var age: TextView = convertViewHolder!!.findViewById(R.id.age)
        var image:ImageView=convertViewHolder!!.findViewById(R.id.image)
        var user: User = list!![position]
        name.text = user.userName
        phoneNumber.text = user.userPhoneNumber.toString()
        age.text = user.userAge.toString()
        image.setImageResource(image1)
        return convertViewHolder
    }
}