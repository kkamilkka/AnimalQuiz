package com.example.android.animalquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Q3 extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q3);
    }

    public void nextq3(View view) {

        EditText answerField = (EditText) findViewById(R.id.pandas_tr);
        String answer = answerField.getText().toString();

        if (answer.equals("Bamboo") || answer.equals("bamboo") || answer.equals("BAMBOO")) {
            score = score + 1;
            Toast toast1 = Toast.makeText(this, "Great! " + score + "point is yours! You are Awesome :)", Toast.LENGTH_SHORT);
            toast1.show();

            Intent intent = new Intent(this, Q4.class);
            startActivity(intent);
        }
        else{
            Toast toast2 = Toast.makeText(this, "You have to try harder. Try again :)", Toast.LENGTH_SHORT);
            toast2.show();
        }

    }

    public void backq3(View view) {
        Intent intent = new Intent(this, Q2.class);
        startActivity(intent);
    }
}
