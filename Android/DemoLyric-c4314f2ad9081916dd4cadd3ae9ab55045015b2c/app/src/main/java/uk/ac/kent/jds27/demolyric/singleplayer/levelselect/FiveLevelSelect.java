package uk.ac.kent.jds27.demolyric.singleplayer.levelselect;

import android.os.Bundle;
import android.widget.Button;

import uk.ac.kent.jds27.demolyric.R;
import uk.ac.kent.jds27.demolyric.singleplayer.GameScreenSingle;

public class FiveLevelSelect extends LevelSelect {

    private Button level1Button;
    private Button level2Button;

    private Class gameScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_level_select);

        level1Button = findViewById(R.id.level501Button);
        level2Button = findViewById(R.id.level502Button);
        gameScreen = GameScreenSingle.class;

        configureButtons();
    }

    /*
     * Method to refresh the buttons after returning from game
     */
    @Override
    protected void onResume() {
        super.onResume();
        configureButtons();
    }

    private void configureButtons() {
        //level 1 button
        configureLevelButton(level1Button, this, gameScreen, 501);
        //level 2 button
        unlockLevel(level2Button, this, gameScreen, 502);
    }
}
