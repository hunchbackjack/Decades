package uk.ac.kent.jds27.demolyric.singleplayer.levelselect;

import android.os.Bundle;
import android.widget.Button;

import uk.ac.kent.jds27.demolyric.R;
import uk.ac.kent.jds27.demolyric.singleplayer.GameScreenSingle;

public class SevenLevelSelect extends LevelSelect {

    private Button level1Button;
    private Button level2Button;
    private Button level3Button;
    private Button level4Button;

    private Class gameScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_level_select);

        level1Button = findViewById(R.id.level701Button);
        level2Button = findViewById(R.id.level702Button);
        level3Button = findViewById(R.id.level703Button);
        level4Button = findViewById(R.id.level704Button);
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
        configureLevelButton(level1Button, this, gameScreen, 701);
        //level 2 button
        unlockLevel(level2Button, this, gameScreen, 702);
        //level 3 button
        unlockLevel(level3Button, this, gameScreen, 703);
        //level 4 button
        unlockLevel(level4Button, this, gameScreen, 704);
    }
}
