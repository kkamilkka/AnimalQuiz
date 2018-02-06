package com.example.android.animalquiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Q2 extends AppCompatActivity {

    int score1 = 0;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q2);
    }

    public void nextq2(View view) {
        if (score1 == 2) {
            score = score + 1;
            Toast toast1 = Toast.makeText(this, "Great! " + score + "point is yours! You are Awesome :)", Toast.LENGTH_SHORT);
            toast1.show();

            Intent intent = new Intent(this, Q3.class);
            startActivity(intent);
        } else {
            Toast toast2 = Toast.makeText(this, "You have to try harder. Try again :)", Toast.LENGTH_SHORT);
            toast2.show();
        }

    }

    public void backq2(View view) {
        Intent intent = new Intent(this, Q1.class);
        startActivity(intent);
    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.koala_chb1:
                if (checked) {
                    score1 = score1 - 1;
                    Toast toast1 = Toast.makeText(this, "Are you sure?", Toast.LENGTH_SHORT);
                    toast1.show();
                    return;
                }
                break;

            case R.id.koala_chb2:
                if (checked) {
                    score1 = score1 + 1;
                    Toast toast1 = Toast.makeText(this, "Great! Almost got it right", Toast.LENGTH_SHORT);
                    toast1.show();
                    return;
                }
                break;

            case R.id.koala_chb3:
                if (checked) {
                    score1 = score1 + 1;
                    Toast toast1 = Toast.makeText(this, "Great! Almost got it right", Toast.LENGTH_SHORT);
                    toast1.show();
                    return;
                }
                break;

            case R.id.koala_chb4:
                if (checked) {
                    score1 = score1 - 1;
                    Toast toast1 = Toast.makeText(this, "Are you sure?", Toast.LENGTH_SHORT);
                    toast1.show();
                    return;
                }
                break;
        }
    }
}
