package uk.ac.kent.jds27.demolyric.singleplayer.levelselect;

import android.os.Bundle;
import android.widget.Button;

import uk.ac.kent.jds27.demolyric.R;
import uk.ac.kent.jds27.demolyric.singleplayer.GameScreenSingle;

public class TwentyLevelSelect extends LevelSelect {

    private Button level1Button;
    private Button level2Button;
    private Button level3Button;
    private Button level4Button;
    private Button level5Button;
    private Button level6Button;
    private Button level7Button;
    private Button level8Button;
    private Button level9Button;
    private Class gameScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_level);

        level1Button = findViewById(R.id.level901Button);
        level2Button = findViewById(R.id.level902Button);
        level3Button = findViewById(R.id.level903Button);
        level4Button = findViewById(R.id.level4Button);
        level5Button = findViewById(R.id.level5Button);
        level6Button = findViewById(R.id.level6Button);
        level7Button = findViewById(R.id.level7Button);
        level8Button = findViewById(R.id.level8Button);
        level9Button = findViewById(R.id.level9Button);

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
        configureLevelButton(level1Button, this, gameScreen, 201);
        //level 2 button
        unlockLevel(level2Button, this, gameScreen, 202);
        //level 3 button
        unlockLevel(level3Button, this, gameScreen, 203);
        //level 4 button
        unlockLevel(level4Button, this, gameScreen, 204);
        //level 5 button
        unlockLevel(level5Button, this, gameScreen, 205);
        //level 6 button
        unlockLevel(level6Button, this, gameScreen, 206);
        //level 7 button
        unlockLevel(level7Button, this, gameScreen, 207);
        //level 8 button
        unlockLevel(level8Button, this, gameScreen, 208);
        //level 9 button
        unlockLevel(level9Button, this, gameScreen, 209);
    }
}
