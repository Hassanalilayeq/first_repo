package com.example.gitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Happy success day to me", Toast.LENGTH_SHORT).show()

        Toast.makeText(this, "log number 1", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "I am in develop branch", Toast.LENGTH_SHORT).show()
    }
}