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

public class MainActivity extends AppCompatActivity {

    //buttons
    private Button playButton;
    private Button singlePlayerButton;

    //layout
    private ConstraintLayout howToConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.playButton);
        howToConstraint = findViewById(R.id.howToConstraint);
        singlePlayerButton = findViewById(R.id.singlePlayerButton);

        MobileAds.initialize(this, "ca-app-pub-5118218345788752~8556723972");

        //banner ad
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        SharedPreferences skipCount = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editSkip = skipCount.edit();

        //check if it's the first run
        if(skipCount.getBoolean("firstTimeRun", true)) {

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

        configurePlayButton();
        configureSingleButton();

        //reset the level select
        DecadeLevelSelect.levelSelect = 0;
    }

    /*
     * Method to configure play button.
     * Sets on click listener and points to decade select page
     */
    private void configurePlayButton() {
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DecadeSelect.class));
            }
        });
    }

    /*
     * Method to configure single player button.
     * Sets on click listener and points to decade select page
     */
    private void configureSingleButton() {
        singlePlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DecadeLevelSelect.class));
            }
        });
    }

    /*
     * Method to display the how to modulo.
     * @param View view
     */
    public void showHowTo(View view) {
        howToConstraint.setVisibility(View.VISIBLE);
    }

    /*
     * Method to close the how to modulo.
     * @param View view
     */
    public void closeHowTo(View view) {
        howToConstraint.setVisibility(View.INVISIBLE);
    }

}