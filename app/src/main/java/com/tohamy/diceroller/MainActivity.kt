package com.tohamy.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var rollButton: Button
    lateinit var resultText: TextView
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews() //define views
        rollButton.setOnClickListener {
            //todo implement roll btn
            RollDice()
            Toast.makeText(this, "Hello toto", Toast.LENGTH_SHORT).show()
        }

    }

    private fun initViews() {
        //this function used to define views by id
        rollButton = findViewById(R.id.roll_btn)
        resultText = findViewById(R.id.result_text)
        diceImage = findViewById(R.id.dice_image)
    }

    private fun RollDice() {
        //This funtion used to generade random number and select dice image depends on rand int number
        var randomInt = Random.nextInt(6) + 1
        val diceDrawable = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultText.setText(randomInt.toString())
        diceImage.setImageResource(diceDrawable)

    }
}