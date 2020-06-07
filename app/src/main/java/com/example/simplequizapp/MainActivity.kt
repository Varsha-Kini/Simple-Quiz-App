package com.example.simplequizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.widget.Button
import kotlinx.android.synthetic.main.question_view.*

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button=findViewById<Button>(R.id.button)
         button.setOnClickListener(){
             val intent= Intent(this,QuestionView::class.java)
             startActivity(intent)
         }
    }


}
