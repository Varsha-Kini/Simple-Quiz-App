package com.example.simplequizapp

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import android.os.Bundle
import android.view.View
import android.content.Intent

class ResultActivity : AppCompatActivity() {
    lateinit var correct: TextView
    lateinit var wrong: TextView
    lateinit var total: TextView
    lateinit var btnRestart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        correct = findViewById<View>(R.id.correct) as TextView
        wrong = findViewById<View>(R.id.wrong) as TextView
        total = findViewById<View>(R.id.Total) as TextView
        btnRestart = findViewById<View>(R.id.restart) as Button

        val sb = StringBuffer()
        sb.append("Correct answers: " + QuestionView.correct + "\n")
        val sb2 = StringBuffer()
        sb2.append("Wrong Answers: " + QuestionView.wrong + "\n")
        val sb3 = StringBuffer()
        sb3.append("Final Score: " + QuestionView.correct + "\n")
        correct.text = sb
        wrong.text = sb2
        total.text = sb3

        QuestionView.correct = 0
        QuestionView.wrong = 0

        btnRestart.setOnClickListener {
            val `in` = Intent(applicationContext, MainActivity::class.java)
            startActivity(`in`)
        }
    }

}
