package com.example.pleshkov_pr12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }
    fun onClickStepsActivity2(view: View){
        val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)
    }
    fun onClickStepsActivity3(view: View){
        val intent = Intent(this, MainActivity7::class.java)
        startActivity(intent)
    }
}