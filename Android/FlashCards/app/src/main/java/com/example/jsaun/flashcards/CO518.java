package com.example.jsaun.flashcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CO518 extends AppCompatActivity {

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
        setContentView(R.layout.activity_co518);

        level1Button = findViewById(R.id.level5181Button);
        level2Button = findViewById(R.id.level5182Button);
        level3Button = findViewById(R.id.level5183Button);
        level4Button = findViewById(R.id.level5184Button);
        level5Button = findViewById(R.id.level5185Button);
        level6Button = findViewById(R.id.level5186Button);
        level7Button = findViewById(R.id.level5187Button);
        level8Button = findViewById(R.id.level5188Button);
        level9Button = findViewById(R.id.level5189Button);
        level10Button = findViewById(R.id.level51810Button);
        level11Button = findViewById(R.id.level51811Button);
        level12Button = findViewById(R.id.level51812Button);
        level13Button = findViewById(R.id.level51813Button);
        level14Button = findViewById(R.id.level51814Button);
        level15Button = findViewById(R.id.level51815Button);

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
        SharedCode.configureLevelButton(level1Button, this, gameScreen, 5181);
        //level 2 button
        SharedCode.configureLevelButton(level2Button, this, gameScreen, 5182);
        //level 3 button
        SharedCode.configureLevelButton(level3Button, this, gameScreen, 5183);
        //level 4 button
        SharedCode.configureLevelButton(level4Button, this, gameScreen, 5184);
        //level 5 button
        SharedCode.configureLevelButton(level5Button, this, gameScreen, 5185);
        //level 6 button
        SharedCode.configureLevelButton(level6Button, this, gameScreen, 5186);
        //level 7 button
        SharedCode.configureLevelButton(level7Button, this, gameScreen, 5187);
        //level 8 button
        SharedCode.configureLevelButton(level8Button, this, gameScreen, 5188);
        //level 9 button
        SharedCode.configureLevelButton(level9Button, this, gameScreen, 5189);
        //level 10 button
        SharedCode.configureLevelButton(level10Button, this, gameScreen, 51810);
        //level 11 button
        SharedCode.configureLevelButton(level11Button, this, gameScreen, 51811);
        //level 12 button
        SharedCode.configureLevelButton(level12Button, this, gameScreen, 51812);
        //level 13 button
        SharedCode.configureLevelButton(level13Button, this, gameScreen, 51813);
        //level 14 button
        SharedCode.configureLevelButton(level14Button, this, gameScreen, 51814);
        //level 15 button
        SharedCode.configureLevelButton(level15Button, this, gameScreen, 51815);
    }
}
