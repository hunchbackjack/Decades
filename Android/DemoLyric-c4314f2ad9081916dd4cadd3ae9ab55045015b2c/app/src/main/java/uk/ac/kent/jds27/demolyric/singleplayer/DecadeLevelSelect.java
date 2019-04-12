package uk.ac.kent.jds27.demolyric.singleplayer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import uk.ac.kent.jds27.demolyric.R;
import uk.ac.kent.jds27.demolyric.singleplayer.levelselect.EightLevelSelect;
import uk.ac.kent.jds27.demolyric.singleplayer.levelselect.FiveLevelSelect;
import uk.ac.kent.jds27.demolyric.singleplayer.levelselect.NinetyLevelSelect;
import uk.ac.kent.jds27.demolyric.singleplayer.levelselect.SevenLevelSelect;
import uk.ac.kent.jds27.demolyric.singleplayer.levelselect.SixLevelSelect;
import uk.ac.kent.jds27.demolyric.singleplayer.levelselect.TenLevelSelect;
import uk.ac.kent.jds27.demolyric.singleplayer.levelselect.TwentyLevelSelect;

public class DecadeLevelSelect extends AppCompatActivity {

    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private Button twentyButton;
    private Button tenButton;
    public static int levelSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_decade_level_select);

        fiveButton = findViewById(R.id.fiveButton);
        sixButton = findViewById(R.id.sixButton);
        sevenButton = findViewById(R.id.sevenButton);
        eightButton = findViewById(R.id.eightButton);
        nineButton = findViewById(R.id.nineButton);
        twentyButton = findViewById(R.id.twentyButton);
        tenButton = findViewById(R.id.tenButton);

        //reset the level selection variable
        levelSelect = 0;

        configureButtons();
    }

    /*
     * Method to make buttons point to individual level screens
     */
    private void configureButtons() {
        //1950's button
        configureButton(fiveButton, FiveLevelSelect.class);
        //1960's button
        configureButton(sixButton, SixLevelSelect.class);
        //1970's button
        configureButton(sevenButton, SevenLevelSelect.class);
        //1980's button
        configureButton(eightButton, EightLevelSelect.class);
        //1990's button
        configureButton(nineButton, NinetyLevelSelect.class);
        //2000's button
        configureButton(twentyButton, TwentyLevelSelect.class);
        //2010's button
        configureButton(tenButton, TenLevelSelect.class);
    }

    /*
     * Method to change the buttons background colour, and then reset it after 50ms
     * @param Button button
     */
    private void changeBackgroundColor(Button button) {
        final Button but = button;
        //change button colour when clicked
        but.setBackgroundColor(ContextCompat.getColor(DecadeLevelSelect.this, R.color.colorPrimaryDark));
        //reset button background colour after 50ms
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                but.setBackgroundColor(ContextCompat.getColor(DecadeLevelSelect.this, R.color.colorPrimary));
            }
        }, 50);
    }

    /*
     * Method to configure buttons.
     * Sets on click listener, changes button colour, and points to specific level select.
     * @param Button button, Class destination
     */
    private void configureButton(Button button, Class destination) {
        //set final to be accessed from inner method
        final Class dest = destination;
        final Button but = button;
        //set on click listener for button
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change button background colour
                changeBackgroundColor(but);
                //point button to specific level select
                startActivity(new Intent(DecadeLevelSelect.this, dest));
            }
        });
    }
}
