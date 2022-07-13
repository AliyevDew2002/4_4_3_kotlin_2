package com.example.a4_4_3_kotlin_2

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    var TAG:String=MainActivity2::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initViews()
    }
    fun initViews(){
        var text=findViewById<TextView>(R.id.main_t)

        var user=intent.getSerializableExtra("user")

        Log.d(TAG,user.toString())

        text.setText(user.toString())

    }
}