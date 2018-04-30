package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button myButton;
        final ImageView ballDisplay;

        ballDisplay = findViewById(R.id.image_eightBall);
        myButton = findViewById(R.id.askButton);

        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGen = new Random();

                int number = randomNumberGen.nextInt(5);
                Log.d("Random", "Number:" + number);
                ballDisplay.setImageResource(ballArray[number]);


            }
        });


        }






    }

