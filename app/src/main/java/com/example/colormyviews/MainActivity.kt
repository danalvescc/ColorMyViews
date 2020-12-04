package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()

    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.dice_1)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.dice_2)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.dice_3)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.dice_4)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.dice_5)
            else -> view.setBackgroundResource(R.drawable.dice_6)
        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> = listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText)

        clickableViews.forEach{v->
            v.setOnClickListener{makeColored(it)}
        }
    }
}