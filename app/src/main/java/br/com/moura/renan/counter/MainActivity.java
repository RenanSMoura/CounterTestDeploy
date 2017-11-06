package br.com.moura.renan.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    final int ONE_POINTS = 1;
    final int TWO_POINTS = 2;
    final int THREE_POINTS = 3;
    final int ZERO_POINTS = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void eraseScore(View v){
        displayForTeamA(ZERO_POINTS);
        displayForTeamB(ZERO_POINTS);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {

        displayForTeamA(scoreTeamA += ONE_POINTS);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {

        displayForTeamB(scoreTeamB += ONE_POINTS);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {

        displayForTeamA(scoreTeamA += TWO_POINTS);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {

        displayForTeamB(scoreTeamB += TWO_POINTS);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {

        displayForTeamA(scoreTeamA += THREE_POINTS);
    }


    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {

        displayForTeamB(scoreTeamB += THREE_POINTS);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }
}