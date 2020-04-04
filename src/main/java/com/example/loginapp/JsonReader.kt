package com.example.loginapp

import android.content.Context
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.File
import java.io.InputStream

class JsonReader {
    fun makeArray():ArrayList<User> {
        var objectMapper = ObjectMapper()
        var list = ArrayList<User>()
       // val readJsonValue: Array<AddressHolder> = objectmapper.readValue(File("/home/bridgelabz/IdeaProjects/Oops_Programs/src/main/kotlin/ar.json"), Array<AddressHolder>::class.java)

       /* val readJsonValue: Array<User> = objectMapper.readValue(
            File("/storage/6132-3735/UserDetails.json"),
            Array<User>::class.java)*//* val readJsonValue: Array<User> = objectMapper.readValue(
            File("/c/Users/ve/AndroidStudioProjects/LoginApp/app/src/main/java/com/example/loginapp/UserDetails.json"),
            Array<User>::class.java)*//*
        for (index in readJsonValue) {
            list.add(index)
        }*/
        val context:Context
       // val inputStream:InputStream=assets.open("UserDetails.json")
      //  json=inputStream.bufferedReader().use { it.readText() }

        return list
    }
}