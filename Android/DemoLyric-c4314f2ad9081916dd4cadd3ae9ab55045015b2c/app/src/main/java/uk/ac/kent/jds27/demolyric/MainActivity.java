package uk.ac.kent.jds27.demolyric;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import uk.ac.kent.jds27.demolyric.multiplayer.DecadeSelect;
import uk.ac.kent.jds27.demolyric.singleplayer.DecadeLevelSelect;

/*
 * Class to display initial home screen
 */
public class MainActivity extends AppCompatActivity {

    //buttons
    private Button playButton;
    private Button singlePlayerButton;
    private Button showHowToButton;
    private Button hideHowToButton;

    //layout
    private ConstraintLayout howToConstraint;

    //shared preferences
    private SharedPreferences skipCount;
    private SharedPreferences.Editor editSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.playButton);
        howToConstraint = findViewById(R.id.howToConstraint);
        singlePlayerButton = findViewById(R.id.singlePlayerButton);
        showHowToButton = findViewById(R.id.showHowToButton);
        hideHowToButton = findViewById(R.id.hideHowToButton);

        //load banner ad
        loadBannerAd();

        //load shared preferences
        skipCount = PreferenceManager.getDefaultSharedPreferences(this);
        editSkip = skipCount.edit();
        editSkip.apply();

        //set up first time run
        checkFirstRun();

        //set on click listeners for buttons
        configureButtons();
    }

    /*
     * Method to configure buttons.
     * Sets on click listener.
     */
    private void configureButtons() {
        //set method for play button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DecadeSelect.class));
            }
        });

        //set method for single player button
        singlePlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DecadeLevelSelect.class));
            }
        });

        //set method for showing how to
        showHowToButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                howToConstraint.setVisibility(View.VISIBLE);

            }
        });

        //set method for hiding how to
        hideHowToButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                howToConstraint.setVisibility(View.INVISIBLE);
            }
        });
    }

    /*
     * Method for setting up first time run
     */
    public void checkFirstRun() {
        //check if it's the first run
        if (skipCount.getBoolean("firstTimeRun", true)) {
            //3 skips per level
            editSkip.putInt("501", 3);
            editSkip.putInt("502", 3);
            editSkip.putInt("601", 3);
            editSkip.putInt("602", 3);
            editSkip.putInt("701", 3);
            editSkip.putInt("702", 3);
            editSkip.putInt("703", 3);
            editSkip.putInt("801", 3);
            editSkip.putInt("802", 3);
            editSkip.putInt("803", 3);
            editSkip.putInt("901", 3);
            editSkip.putInt("902", 3);
            editSkip.putInt("903", 3);
            editSkip.putInt("201", 3);
            editSkip.putInt("202", 3);
            editSkip.putInt("203", 3);
            editSkip.putInt("204", 3);
            editSkip.putInt("205", 3);
            editSkip.putInt("206", 3);
            editSkip.putInt("207", 3);
            editSkip.putInt("208", 3);
            editSkip.putInt("209", 3);
            editSkip.putInt("101", 3);
            editSkip.putInt("102", 3);
            editSkip.putInt("103", 3);
            editSkip.putInt("104", 3);
            editSkip.putInt("105", 3);
            editSkip.putInt("106", 3);
            editSkip.putInt("107", 3);
            editSkip.putInt("108", 3);
            editSkip.putInt("109", 3);

            //set first time run variable to false so skips won't be added again
            editSkip.putBoolean("firstTimeRun", false);

            editSkip.apply();
        }
    }

    /*
     * Method to load banner ad
     */
    public void loadBannerAd() {
        //initialise ad (currently with test id)
        MobileAds.initialize(this, "ca-app-pub-5118218345788752~8556723972");
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        //load ad
        mAdView.loadAd(adRequest);
    }
}