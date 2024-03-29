package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var diceImage3 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.rollBtn)
        val resetButton: Button = findViewById(R.id.resetBtn)
        rollButton.setOnClickListener { rollDice() }
        resetButton.setOnClickListener{ resetDice()}
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice2_image)
        diceImage3 = findViewById(R.id.dice3_image)
    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()


        diceImage.setImageResource(generateRandom())
        diceImage2.setImageResource(generateRandom())
        diceImage3.setImageResource(generateRandom())

    }

    private fun generateRandom():Int{
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        return drawableResource
    }

    private fun resetDice() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
        diceImage3.setImageResource(R.drawable.empty_dice)



    }




}
