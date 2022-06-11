package com.example.pleshkov_pr12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pleshkov_pr12.MainActivity4
import com.example.pleshkov_pr12.R

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }
}