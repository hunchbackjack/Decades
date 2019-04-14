package uk.ac.kent.jds27.demolyric.singleplayer.levelselect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import uk.ac.kent.jds27.demolyric.R;
import uk.ac.kent.jds27.demolyric.SharedCode;
import uk.ac.kent.jds27.demolyric.singleplayer.GameScreenSingle;

public class SixLevelSelect extends AppCompatActivity {

    private Button level1Button;
    private Button level2Button;

    private Class gameScreen;

    private SharedCode sharedCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_level_select);

        level1Button = findViewById(R.id.level601Button);
        level2Button = findViewById(R.id.level602Button);
        gameScreen = GameScreenSingle.class;

        sharedCode = new SharedCode();

        configureButtons();
    }

    private void configureButtons() {
        //level 1 button
        SharedCode.configureButton(level1Button, this, gameScreen, 601);
        //level 2 button
        sharedCode.unlockLevel(level2Button, this, gameScreen, 602);
    }
}
