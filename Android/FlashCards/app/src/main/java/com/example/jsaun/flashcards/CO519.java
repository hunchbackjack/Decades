package com.example.jsaun.flashcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CO519 extends AppCompatActivity {

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
        setContentView(R.layout.activity_co519);

        level1Button = findViewById(R.id.level5191Button);
        level2Button = findViewById(R.id.level5192Button);
        level3Button = findViewById(R.id.level5193Button);
        level4Button = findViewById(R.id.level5194Button);
        level5Button = findViewById(R.id.level5195Button);
        level6Button = findViewById(R.id.level5196Button);
        level7Button = findViewById(R.id.level5197Button);
        level8Button = findViewById(R.id.level5198Button);
        level9Button = findViewById(R.id.level5199Button);
        level10Button = findViewById(R.id.level51910Button);
        level11Button = findViewById(R.id.level51911Button);
        level12Button = findViewById(R.id.level51912Button);
        level13Button = findViewById(R.id.level51913Button);
        level14Button = findViewById(R.id.level51914Button);
        level15Button = findViewById(R.id.level51915Button);

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
        SharedCode.configureLevelButton(level1Button, this, gameScreen, 5191);
        //level 2 button
        SharedCode.configureLevelButton(level2Button, this, gameScreen, 5192);
        //level 3 button
        SharedCode.configureLevelButton(level3Button, this, gameScreen, 5193);
        //level 4 button
        SharedCode.configureLevelButton(level4Button, this, gameScreen, 5194);
        //level 5 button
        SharedCode.configureLevelButton(level5Button, this, gameScreen, 5195);
        //level 6 button
        SharedCode.configureLevelButton(level6Button, this, gameScreen, 5196);
        //level 7 button
        SharedCode.configureLevelButton(level7Button, this, gameScreen, 5197);
        //level 8 button
        SharedCode.configureLevelButton(level8Button, this, gameScreen, 5198);
        //level 9 button
        SharedCode.configureLevelButton(level9Button, this, gameScreen, 5199);
        //level 10 button
        SharedCode.configureLevelButton(level10Button, this, gameScreen, 51910);
        //level 11 button
        SharedCode.configureLevelButton(level11Button, this, gameScreen, 51911);
        //level 12 button
        SharedCode.configureLevelButton(level12Button, this, gameScreen, 51912);
        //level 13 button
        SharedCode.configureLevelButton(level13Button, this, gameScreen, 51913);
        //level 14 button
        SharedCode.configureLevelButton(level14Button, this, gameScreen, 51914);
        //level 15 button
        SharedCode.configureLevelButton(level15Button, this, gameScreen, 51915);
    }
}
