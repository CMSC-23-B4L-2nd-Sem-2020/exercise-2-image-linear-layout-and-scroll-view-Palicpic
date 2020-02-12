package com.example.exer2_palicpic_b4l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //initialize the variables
    private lateinit var princessImage : ImageView
    private lateinit var princessBioText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //find the component by id
        princessImage = findViewById(R.id.princess_img)
        princessBioText = findViewById(R.id.princess_bio_text)

        //set on click listener when start button is click
        val startButton: Button = findViewById(R.id.start_button)
        startButton.setOnClickListener { pickPrincess() }

        //set on click listener when retry button is click, reset the data
        val retryButton: Button = findViewById(R.id.retry_button)
        retryButton.setOnClickListener { reset() }

    }

    //function to pick princess
    private fun pickPrincess () {
        //generate random number from 1-12
        val randomInt = (1..12).random()

        //pick princess
        val drawableResource = when (randomInt) {
            1 -> R.drawable.anna
            2 -> R.drawable.ariel
            3 -> R.drawable.aurora
            4 -> R.drawable.belle
            5 -> R.drawable.cinderella
            6 -> R.drawable.elsa
            7 -> R.drawable.jasmine
            8 -> R.drawable.moana
            9 -> R.drawable.mulan
            10 -> R.drawable.rapunzel
            11 -> R.drawable.snow_white
            else -> R.drawable.tiana
        }

        //pick bio
        val stringResource = when (randomInt) {
            1 -> R.string.anna_bio
            2 -> R.string.ariel_bio
            3 -> R.string.aurora_bio
            4 -> R.string.belle_bio
            5 -> R.string.cinderella_bio
            6 -> R.string.elsa_bio
            7 -> R.string.jasmine_bio
            8 -> R.string.moana_bio
            9 -> R.string.mulan_bio
            10 -> R.string.rapunzel_bio
            11 -> R.string.snowwhite_bio
            else -> R.string.tiana_bio
        }

        //set the image and bio
        princessImage.setImageResource(drawableResource)
        princessBioText.setText(stringResource)

    }

    //function to reset the image and bio
    private fun reset(){
        princessImage.setImageResource(R.drawable.all_princess)
        princessBioText.setText(R.string.start_text)

    }
}