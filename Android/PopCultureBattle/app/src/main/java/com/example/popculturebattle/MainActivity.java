package com.example.popculturebattle;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //buttons
    private Button playButton;

    //list to store all the current questions
    public static ArrayList<String> filmList = new ArrayList<>();
    public static ArrayList<String> musicList = new ArrayList<>();
    public static ArrayList<String> historyList = new ArrayList<>();
    public static ArrayList<String> genList = new ArrayList<>();

    public QuestionsAndAnswers qa = new QuestionsAndAnswers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        addQuestions();

        playButton = findViewById(R.id.playButton);

        //set on click listeners for buttons
        configureButtons();
    }

    /*
     * Method to configure buttons.
     * Sets on click listener.
     */
    private void configureButtons() {
        //set method for play button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CategorySelect.class));
            }
        });
    }

    /*
     * Method to add songs from specified decades into the game.
     * @param ArrayList<String> array
     */
    private void addQuestions() {
        filmList.addAll(qa.getFilmList());
        musicList.addAll(qa.getMusicList());
        historyList.addAll(qa.getHistoryList());
        genList.addAll(qa.getGenList());
    }

}
