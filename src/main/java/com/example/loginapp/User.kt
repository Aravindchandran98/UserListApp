package com.example.loginapp

class User {
    var userName: String? = null
    var userPhoneNumber: Long = 0
    var userAge: Int = 0

    constructor(userName: String, userPhoneNumber: Long, userAge: Int) {
        this.userName = userName
        this.userPhoneNumber = userPhoneNumber
        this.userAge = userAge
    }

    override fun toString(): String {
        return "userName=$userName, userPhoneNumber=$userPhoneNumber, userAge=$userAge"
    }


}