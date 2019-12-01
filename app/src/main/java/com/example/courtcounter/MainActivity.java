package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plus_3_A(View view) {
        scoreA +=3;
        displayForTeamA(scoreA);
    }
    public void plus_2_A(View view) {
        scoreA +=2;
        displayForTeamA(scoreA);
    }
    public void plus_1_A(View view) {
        scoreA++;
        displayForTeamA(scoreA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plus_3_B(View view) {
        scoreB +=3;
        displayForTeamB(scoreB);
    }
    public void plus_2_B(View view) {
        scoreB +=2;
        displayForTeamB(scoreB);
    }
    public void plus_1_B(View view) {
        scoreB++;
        displayForTeamB(scoreB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
