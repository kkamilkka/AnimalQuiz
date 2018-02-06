package com.example.android.animalquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by kamila on 25.01.2018.
 */

public class Q1 extends AppCompatActivity {

    int score;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q1);

        final RadioButton rb2 = (RadioButton)findViewById(R.id.dolphins_true);
        rb2.setChecked(true);
    }

    public void nextq1(View view) {

        rb = (RadioButton)findViewById(R.id.dolphins_true);
        if (rb.isChecked()){
            score = score + 1;
            Toast toast1 = Toast.makeText(this, "Great! " + score + "point is yours! You are Awesome :)", Toast.LENGTH_SHORT);
            toast1.show();

            Intent intent = new Intent(this, Q2.class);
            startActivity(intent);
        }
        else{
            Toast toast2 = Toast.makeText(this, "You have to try harder. Try again :)", Toast.LENGTH_SHORT);
            toast2.show();
        }


    }
    public void backq1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.dolphins_true:
                if (checked)
                    break;
            case R.id.dolphins_false:
                if (checked)
                    break;
        }
    }
}