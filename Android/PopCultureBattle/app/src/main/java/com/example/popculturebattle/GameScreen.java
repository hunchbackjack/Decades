package com.example.popculturebattle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class GameScreen extends AppCompatActivity {

    //buttons
    private Button nextButton;

    //text views
    private TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_screen);

        question = findViewById(R.id.questionString);
        nextButton = findViewById(R.id.nextButton);

        question.setMovementMethod(new ScrollingMovementMethod());

        //set methods for all buttons
        configureButtons();

        if (CategorySelect.filmClicked) {
            //set initial lyric
            haveGo(MainActivity.filmList);
        }
        else if (CategorySelect.musicClicked) {
            haveGo(MainActivity.musicList);
        }
        else if (CategorySelect.historyClicked) {
            haveGo(MainActivity.historyList);
        }
        else if (CategorySelect.genClicked) {
            haveGo(MainActivity.genList);
        }
        else if (CategorySelect.battleClicked) {
            haveGo(MainActivity.battleList);
        }
    }

    /*
     * Method to initiate a round.
     * Checks if count is greater than number of rounds, if so then game is complete.
     * If count is >= number of rounds then a random lyric is displayed.
     * @param View view
     */
    @SuppressWarnings({"WeakerAccess", "unused"})
    public void haveGo(ArrayList array) {
        //get new song string
        String turn = getQuestion(array);
        //display the new song
        question.setText(turn);
    }

    /*
     * Method to set methods for all buttons.
     */
    private void configureButtons() {
        //set method for next button
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameScreen.this, CategorySelect.class));
            }
        });
    }

    /*
     * Method to get random string from an array.
     * @param ArrayList<String> array
     */
    protected String getQuestion(ArrayList<String> array) {
        //set lyric to null to avoid not initialised error
        String randomQuestion = "List empty";
        //check that array size is greater than 0 to avoid null pointer exception
        if (array.size() > 0) {
            //get random index
            Random rand = new Random();
            int index = rand.nextInt(array.size());
            //retrieve random string
            for (String question : array) {
                if (index == array.indexOf(question)) {
                    randomQuestion = question;
                }
            }
            //remove the string from the array
            array.remove(index);

        }
        //return the string
        return randomQuestion;
    }
}

