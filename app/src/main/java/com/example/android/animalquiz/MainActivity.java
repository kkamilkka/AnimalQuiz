package com.example.android.animalquiz;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void to_different_page(View view) {
        Intent intent = new Intent(this, Q1.class);
        startActivity(intent);
    }


    public class GlobalClass extends Application {
        private int score = 0;


        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }
}


