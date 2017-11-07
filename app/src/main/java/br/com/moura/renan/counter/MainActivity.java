package br.com.moura.renan.counter;

import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    final int ONE_POINTS = 1;
    final int TWO_POINTS = 2;
    final int THREE_POINTS = 3;
    final int ZERO_POINTS = 0;
    String name = MainActivity.class.getName().toString();
    private Tracker mTracker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if(checkConfiguration()){
            AnalyticsApplication application =(AnalyticsApplication) getApplication();
            mTracker = application.getDefaultTracker();
        //}




    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "Setting screen name: " + name);
        mTracker.setScreenName("Image~" + name);
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
    }



    public void eraseScore(View v){
        erasePointsofBothTeams();
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

    public void erasePointsofBothTeams(){
        scoreTeamA  = scoreTeamB = 0;
    }
}