package com.example.exam_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NumberText = findViewById(R.id.txtNumber)
        NextNumber = findViewById(R.id.btnNextNumber)
    }
    lateinit var NumberText: TextView
    lateinit var NextNumber: Button
    var counter = 1

    fun btnNextClick(view: View){
        NumberText.text = counter.toString()
        counter = if (counter < 10) counter + 1 else 1
    }
}