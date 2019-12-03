package com.example.courtcounter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    int subA = 0;
    int subB = 0;
    int foulA = 0;
    int foulB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //to display the values on opening the app
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        displayFoulTeamA(foulA);
        displayFoulTeamB(foulB);
        displaySubTeamA(subA);
        displaySubTeamB(subB);

    }

    //display number of goals for team
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //increase goals
    public void goalTeamA(View view) {
        displayForTeamA(++scoreA);
    }

    public void goalTeamB(View view) {
        displayForTeamB(++scoreB);
    }
    //display number of fouls
    @SuppressLint("SetTextI18n")
    public void displayFoulTeamA(int foul) {
        TextView scoreView = findViewById(R.id.team_a_foul);
        scoreView.setText("Fouls: " + foul);
    }

    @SuppressLint("SetTextI18n")
    public void displayFoulTeamB(int foul) {
        TextView scoreView = findViewById(R.id.team_b_foul);
        scoreView.setText("Fouls: " + foul);
    }

    //increase fouls
    public void foulA(View view) {
        displayFoulTeamA(++foulA);
    }

    public void foulB(View view) {
        displayFoulTeamB(++foulB);
    }

    //display substitutes
    @SuppressLint("SetTextI18n")
    public void displaySubTeamA(int sub) {
        TextView scoreView = findViewById(R.id.team_a_sub);
        scoreView.setText("Substitutes: " + sub);
    }

    @SuppressLint("SetTextI18n")
    public void displaySubTeamB(int sub) {
        TextView scoreView = findViewById(R.id.team_b_sub);
        scoreView.setText("Substitutes: " + sub);
    }

    //increase substitutes _ every team has only three available subs_
    public void subA(View view) {
        if (subA < 3) displaySubTeamA(++subA);
        else Toast.makeText(getApplicationContext(),
                "You can't do more than 3 substitutes",
                Toast.LENGTH_SHORT).show();
    }

    public void subB(View view) {
        if (subB < 3) displaySubTeamB(++subB);
        else Toast.makeText(getApplicationContext(),
                "You can't do more than 3 substitutes",
                Toast.LENGTH_SHORT).show();
    }

    // reset all values to zero
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        subA = 0;
        subB = 0;
        foulA = 0;
        foulB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        displayFoulTeamA(foulA);
        displayFoulTeamB(foulB);
        displaySubTeamA(subA);
        displaySubTeamB(subB);
    }
}
