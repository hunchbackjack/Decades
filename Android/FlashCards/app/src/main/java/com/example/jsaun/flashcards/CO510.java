package com.example.jsaun.flashcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CO510 extends AppCompatActivity {

    private Button level1Button;
    private Button level2Button;
    private Button level3Button;
    private Button level4Button;
    private Button level5Button;
    private Button level6Button;
    private Button level7Button;
    private Button level8Button;
    private Button level9Button;
    private Button level10Button;
    private Button level11Button;
    private Button level12Button;
    private Button level13Button;
    private Button level14Button;
    private Button level15Button;

    private Class gameScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_co510);

        level1Button = findViewById(R.id.level5101Button);
        level2Button = findViewById(R.id.level5102Button);
        level3Button = findViewById(R.id.level5103Button);
        level4Button = findViewById(R.id.level5104Button);
        level5Button = findViewById(R.id.level5105Button);
        level6Button = findViewById(R.id.level5106Button);
        level7Button = findViewById(R.id.level5107Button);
        level8Button = findViewById(R.id.level5108Button);
        level9Button = findViewById(R.id.level5109Button);
        level10Button = findViewById(R.id.level51010Button);
        level11Button = findViewById(R.id.level51011Button);
        level12Button = findViewById(R.id.level51012Button);
        level13Button = findViewById(R.id.level51013Button);
        level14Button = findViewById(R.id.level51014Button);
        level15Button = findViewById(R.id.level51015Button);

        gameScreen = CardScreen.class;

        configureButtons();
    }

    @Override
    protected void onResume() {
        super.onResume();
        configureButtons();
    }

    private void configureButtons() {
        //level 1 button
        SharedCode.configureLevelButton(level1Button, this, gameScreen, 5101);
        //level 2 button
        SharedCode.configureLevelButton(level2Button, this, gameScreen, 5102);
        //level 3 button
        SharedCode.configureLevelButton(level3Button, this, gameScreen, 5103);
        //level 4 button
        SharedCode.configureLevelButton(level4Button, this, gameScreen, 5104);
        //level 5 button
        SharedCode.configureLevelButton(level5Button, this, gameScreen, 5105);
        //level 6 button
        SharedCode.configureLevelButton(level6Button, this, gameScreen, 5106);
        //level 7 button
        SharedCode.configureLevelButton(level7Button, this, gameScreen, 5107);
        //level 8 button
        SharedCode.configureLevelButton(level8Button, this, gameScreen, 5108);
        //level 9 button
        SharedCode.configureLevelButton(level9Button, this, gameScreen, 5109);
        //level 10 button
        SharedCode.configureLevelButton(level10Button, this, gameScreen, 51010);
        //level 11 button
        SharedCode.configureLevelButton(level11Button, this, gameScreen, 51011);
        //level 12 button
        SharedCode.configureLevelButton(level12Button, this, gameScreen, 51012);
        //level 13 button
        SharedCode.configureLevelButton(level13Button, this, gameScreen, 51013);
        //level 14 button
        SharedCode.configureLevelButton(level14Button, this, gameScreen, 51014);
        //level 15 button
        SharedCode.configureLevelButton(level15Button, this, gameScreen, 51015);
    }
}
