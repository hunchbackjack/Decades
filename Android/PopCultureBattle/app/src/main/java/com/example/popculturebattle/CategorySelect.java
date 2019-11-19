package com.example.popculturebattle;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CategorySelect extends AppCompatActivity {

    //booleans to keep track of what has been selected
    public static boolean filmClicked;
    public static boolean musicClicked;
    public static boolean historyClicked;
    public static boolean genClicked;

    private Button filmButton;
    private Button musicButton;
    private Button historyButton;
    private Button genButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_category_select);

        filmButton = findViewById(R.id.fiveButton);
        musicButton = findViewById(R.id.sixButton);
        historyButton = findViewById(R.id.sevenButton);
        genButton = findViewById(R.id.eightButton);

        //initialise booleans
        filmClicked = false;
        musicClicked = false;
        historyClicked = false;
        genClicked = false;

        configureButtons();
    }

    public void configureButtons() {
        filmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filmClicked = true;
                startActivity(new Intent(CategorySelect.this, GameScreen.class));
            }
        });
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicClicked = true;
                startActivity(new Intent(CategorySelect.this, GameScreen.class));
            }
        });
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                historyClicked = true;
                startActivity(new Intent(CategorySelect.this, GameScreen.class));
            }
        });
        genButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                genClicked = true;
                startActivity(new Intent(CategorySelect.this, GameScreen.class));
            }
        });
    }
}
