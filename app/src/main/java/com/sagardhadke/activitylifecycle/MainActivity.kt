package com.sagardhadke.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gotoNext = findViewById<TextView>(R.id.textView)
        gotoNext.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

    }

    override fun onStart() {
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        super.onStart()
    }

    override fun onResume() {
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
        super.onResume()
    }

    override fun onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onDestroy() {
        Toast.makeText(this, "onDestroy Thanks For USing this Application", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}