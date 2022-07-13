package com.example.a4_4_3_kotlin_2.model


import java.io.Serializable

class User(private var age:Int,private var name:String):Serializable{

    override fun toString():String{
        return "User{Name="+name+", Age="+age+'}';
    }
}