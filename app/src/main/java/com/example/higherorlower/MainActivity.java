package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    // access the randomNumber in this method but not create in this method
    // otherwise it will generate a new random number each time button is pressed
    public void guess(View view) {


        EditText editText = findViewById(R.id.guessEditText);

        // Log.i("Entered Value", editText.getText().toString());

        int guessVal = Integer.parseInt(editText.getText().toString());

        String message;

        if(guessVal < randomNumber)
            message = "Higher";
        else if (guessVal > randomNumber)
            message = "Lower";
        else
            message = "You got it!";

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        // logs the random number on button press
        // Log.i("Info", Integer.toString(randomNumber));

    }

    // runs code when the app is loaded
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}