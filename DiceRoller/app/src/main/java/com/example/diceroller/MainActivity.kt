package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById(R.id.roll_botton) as Button
        val dicerImage = findViewById(R.id.dicer_image) as ImageView

        rollButton.setOnClickListener()
        {
            var nextValue = Random.nextInt(1, 7)
            when (nextValue) {
                1 -> dicerImage.setImageResource(R.drawable.dice_1)
                2 -> dicerImage.setImageResource(R.drawable.dice_2)
                3 -> dicerImage.setImageResource(R.drawable.dice_3)
                4 -> dicerImage.setImageResource(R.drawable.dice_4)
                5 -> dicerImage.setImageResource(R.drawable.dice_5)
                6 -> dicerImage.setImageResource(R.drawable.dice_6)
            }

        }
    }
}
