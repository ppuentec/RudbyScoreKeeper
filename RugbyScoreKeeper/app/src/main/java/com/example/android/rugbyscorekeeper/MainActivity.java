package com.example.android.rugbyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void TryTeamA (View view) {
        scoreA=scoreA+5;
        displayForTeamA(scoreA);
    }

    public void ConversionTeamA (View view) {
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }

    public void PenaltyTeamA (View view) {              
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }

    public void DropGoalTeamA (View view) {
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void TryTeamB (View view) {
        scoreB=scoreB+5;
        displayForTeamB(scoreB);
    }

    public void ConversionTeamB (View view) {
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }

    public void PenaltyTeamB (View view) {
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }

    public void DropGoalTeamB (View view) {
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }

    public void reset (View view) {
        scoreA=0;
        scoreB=0;
        displayForTeamB(scoreB);
        displayForTeamA(scoreA);
    }
}
