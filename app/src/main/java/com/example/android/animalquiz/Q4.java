package com.example.android.animalquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Q4 extends AppCompatActivity {

    int score;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q4);
    }

    public void nextq4(View view) {

        rb = (RadioButton) findViewById(R.id.giraffe_false);
        if (rb.isChecked()) {
            score = score + 1;
            Toast toast1 = Toast.makeText(this, "Great! " + score + "point is yours! You are Awesome :)", Toast.LENGTH_SHORT);
            toast1.show();

            Intent intent = new Intent(this, Summary.class);
            startActivity(intent);
        } else {
            Toast toast2 = Toast.makeText(this, "You have to try harder. Try again :)", Toast.LENGTH_SHORT);
            toast2.show();
        }

    }

    public void backq4(View view) {
        Intent intent = new Intent(this, Q3.class);
        startActivity(intent);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.giraffe_true:
                if (checked)
                    break;
            case R.id.giraffe_false:
                if (checked)
                    break;
        }
    }
}
