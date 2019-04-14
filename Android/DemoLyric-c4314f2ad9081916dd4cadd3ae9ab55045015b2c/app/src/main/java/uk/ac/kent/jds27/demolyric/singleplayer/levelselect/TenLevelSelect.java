package uk.ac.kent.jds27.demolyric.singleplayer.levelselect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import uk.ac.kent.jds27.demolyric.R;
import uk.ac.kent.jds27.demolyric.SharedCode;
import uk.ac.kent.jds27.demolyric.singleplayer.GameScreenSingle;

public class TenLevelSelect extends AppCompatActivity {

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

    private SharedCode sharedCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten_level_select);

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

        sharedCode = new SharedCode();

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
        SharedCode.configureLevelButton(level1Button, this, gameScreen, 101);
        //level 2 button
        sharedCode.unlockLevel(level2Button, this, gameScreen, 102);
        //level 3 button
        sharedCode.unlockLevel(level3Button, this, gameScreen, 103);
        //level 4 button
        sharedCode.unlockLevel(level4Button, this, gameScreen, 104);
        //level 5 button
        sharedCode.unlockLevel(level5Button, this, gameScreen, 105);
        //level 6 button
        sharedCode.unlockLevel(level6Button, this, gameScreen, 106);
        //level 7 button
        sharedCode.unlockLevel(level7Button, this, gameScreen, 107);
        //level 8 button
        sharedCode.unlockLevel(level8Button, this, gameScreen, 108);
        //level 9 button
        sharedCode.unlockLevel(level9Button, this, gameScreen, 109);
    }
}
