package br.com.moura.renan.counter;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by renanmoura on 07/11/17.
 */

public class AnalyticsApplication extends Application {
    private static Tracker mTracker;
    private static GoogleAnalytics sAnalytics;

    @Override
    public void onCreate() {
        super.onCreate();

        sAnalytics = GoogleAnalytics.getInstance(this);
    }

    synchronized public Tracker getDefaultTracker(){
        if(mTracker == null){
            mTracker = sAnalytics.newTracker(R.xml.global_tracker);
        }
        return mTracker;
    }
}
