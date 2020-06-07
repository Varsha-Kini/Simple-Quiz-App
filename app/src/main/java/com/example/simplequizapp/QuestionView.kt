package com.example.simplequizapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

public class QuestionView :AppCompatActivity(){
    lateinit var answer1: Button
    lateinit var answer2: Button
    lateinit var answer3: Button
    lateinit var answer4: Button
    lateinit var score: TextView
    lateinit var question: TextView
    lateinit var quit:Button

    private var mScore = 0
    internal var mQuestions = arrayOf("Which operator is right-associative", "Which module is used in Python to create Graphics", "Who launched \"My Life, My Yoga\" contest amid lockdown?")
    private val mChoices = arrayOf("A. *", "B. =", "C. +", "D. %", "A. Turtle", "B. Canvas", "C. Tkinter", "D. Graphics", "A. President Ram Nath Kovind", "B. PM Narendra Modi", "C. President Xi Jinping", "D. President Vladimir Putin")
    private val mCorrectAnswers = arrayOf("B. =", "A. Turtle", "B. PM Narendra Modi")
    internal var flag = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_view)


        answer1 = findViewById<Button>(R.id.AnswerA)
        answer2 = findViewById<Button>(R.id.AnswerB)
        answer3 = findViewById<Button>(R.id.AnswerC)
        answer4 = findViewById<Button>(R.id.AnswerD)
        score = findViewById<TextView>(R.id.score)
        question = findViewById<TextView>(R.id.question)
        quit=findViewById<Button>(R.id.quit)
        score.text = "Score: $mScore"
        question.text = mQuestions[flag]
        answer1.text = mChoices[flag]
        answer2.text = mChoices[flag + 1]
        answer3.text = mChoices[flag + 2]
        answer4.text = mChoices[flag + 3]


        //updateQuestion(r.nextInt(mQuestionLength));

        answer1.setOnClickListener {
            if (answer1.text === mCorrectAnswers[flag]) {
                mScore++
                score.text = "Score: $mScore"
                //updateQuestion(r.nextInt(mQuestionLength));
                correct++


                nextQuestion()

            } else {
                score.text = "Score: $mScore"
                //updateQuestion(r.nextInt(mQuestionLength));
                wrong++

                nextQuestion()


            }
        }
        answer2.setOnClickListener {
            if (answer2.text === mCorrectAnswers[flag]) {
                mScore++
                score.text = "Score: $mScore"
                //updateQuestion(r.nextInt(mQuestionLength));
                correct++
                nextQuestion()

            } else {
                score.text = "Score: $mScore"
                //updateQuestion(r.nextInt(mQuestionLength));
                wrong++
                nextQuestion()


            }
        }
        answer3.setOnClickListener {
            if (answer1.text === mCorrectAnswers[flag]) {
                mScore++
                score.text = "Score: $mScore"
                //updateQuestion(r.nextInt(mQuestionLength));
                correct++
                nextQuestion()

            } else {
                score.text = "Score: $mScore"
                //updateQuestion(r.nextInt(mQuestionLength));
                wrong++
                nextQuestion()


            }
        }
        answer4.setOnClickListener {
            if (answer1.text === mCorrectAnswers[flag]) {
                mScore++
                score.text = "Score: $mScore"
                //updateQuestion(r.nextInt(mQuestionLength));
                correct++
                nextQuestion()

            } else {
                score.text = "Score: $mScore"
                //updateQuestion(r.nextInt(mQuestionLength));
                wrong++
                nextQuestion()


            }
        }


    }

    private fun nextQuestion() {
        flag++
        if (flag < mQuestions.size) {
            question.text = mQuestions[flag]
            answer1.text = mChoices[flag * 4]
            answer2.text = mChoices[flag * 4 + 1]
            answer3.text = mChoices[flag * 4 + 2]
            answer4.text = mChoices[flag * 4 + 3]
        } else {
            val `in` = Intent(applicationContext, ResultActivity::class.java)
            startActivity(`in`)

        }
        quit.setOnClickListener(){
            val `in` = Intent(applicationContext, ResultActivity::class.java)
            startActivity(`in`)

        }
    }

    companion object {
        var correct: Int = 0
        var wrong: Int = 0
        var marks: Int = 0
    }




}




