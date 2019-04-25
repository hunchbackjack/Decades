package uk.ac.kent.jds27.demolyric.singleplayer.levelselect;

import android.os.Bundle;
import android.widget.Button;

import uk.ac.kent.jds27.demolyric.R;
import uk.ac.kent.jds27.demolyric.singleplayer.GameScreenSingle;

public class EightLevelSelect extends LevelSelect {

    private Button level1Button;
    private Button level2Button;
    private Button level3Button;

    private Class gameScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_eight_level_select);

        level1Button = findViewById(R.id.level801Button);
        level2Button = findViewById(R.id.level802Button);
        level3Button = findViewById(R.id.level803Button);

        gameScreen = GameScreenSingle.class;

        configureButtons();
    }

    @Override
    protected void onResume() {
        super.onResume();
        configureButtons();
    }

    private void configureButtons() {
        //level 1 button
        configureLevelButton(level1Button, this, gameScreen, 801);
        //level 2 button
        unlockLevel(level2Button, this, gameScreen, 802);
        //level 3 button
        unlockLevel(level3Button, this, gameScreen, 803);
    }
}
