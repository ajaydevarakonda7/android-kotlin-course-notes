package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                box_one_text,
                box_two_text,
                box_three_text,
                box_four_text,
                box_five_text,
                constraint_layout,
                red_button,
                green_button,
                yellow_button
            )

        for (view in clickableViews) {
            view.setOnClickListener {
                makeColored(it)
            }
        }
    }

    fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> constraint_layout.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> constraint_layout.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> constraint_layout.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
