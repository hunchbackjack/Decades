package uk.ac.kent.jds27.demolyric;

import android.content.Context;
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

    private SharedPreferences skipCount;
    private SharedPreferences.Editor editSkip;

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

        skipCount = PreferenceManager.getDefaultSharedPreferences(this);
        editSkip = skipCount.edit();

        if(skipCount.getBoolean("firstTimeRun", true)) {

            editSkip.putInt("50", 3);
            editSkip.putInt("60", 3);
            editSkip.putInt("70", 3);
            editSkip.putInt("80", 3);
            editSkip.putInt("90", 3);
            editSkip.putInt("20", 3);
            editSkip.putInt("10", 3);

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