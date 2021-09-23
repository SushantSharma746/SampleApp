package com.example.sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_awesome_library.AwesomeLogger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AwesomeLogger.isEnabled = true
        AwesomeLogger.d(":MainActivity","Hello")

    }
}