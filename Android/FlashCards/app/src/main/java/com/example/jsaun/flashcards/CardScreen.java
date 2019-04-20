package com.example.jsaun.flashcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class CardScreen extends AppCompatActivity {

    //list to hold lyrics to current game
    private ArrayList<String> tempCards = new ArrayList<>();
    //list to reset lyrics when resetting game
    private ArrayList<String> resetList = new ArrayList<>();

    //buttons
    private Button nextButton;
    private Button tryAgainButton;
    private Button homeButton;
    private Button answerButton;
    private Button nextLevelButton;
    private Button backButton;

    //strings
    private String card;
    private String answerString;
    private String question;

    //text view
    private TextView cardString;
    private TextView turnCount;

    //int to keep track of round number
    private int count = 0;
    //variable to store total number of rounds
    private int goCount;
    //variable to store the level
    private int currentLevel;
    private int nextLevel;

    //variable to access CO510 list
    private CO510List listCO510;
    private CO518List listCO518;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_screen);

        cardString = findViewById(R.id.cardString);
        turnCount = findViewById(R.id.turnCount);
        answerButton = findViewById(R.id.answerButton);
        nextButton = findViewById(R.id.nextButton);
        backButton = findViewById(R.id.backButton);
        tryAgainButton = findViewById(R.id.tryAgainButton);
        homeButton = findViewById(R.id.homeButton);
        nextLevelButton = findViewById(R.id.nextLevelButton);

        listCO510 = new CO510List();
        listCO518 = new CO518List();

        answerString = null;
        question = null;

        //set current level
        currentLevel = ModuleSelect.levelSelect;

        getLevelList(levelSelect(ModuleSelect.levelSelect));

        ModuleSelect.levelSelect = 0;

        goCount = tempCards.size();

        //set next level
        nextLevel = currentLevel + 1;

        //configure button functionality
        configureButtons();

        //initialise lyric string
        haveGo();
    }

    /*
     * Method to add all songs from an array to tempSongs and resetList
     * @param ArrayList array
     */
    private void getLevelList(ArrayList<String> array) {
        //clear the current lists
        tempCards.clear();
        resetList.clear();
        //reset them with the new array
        tempCards.addAll(array);
        resetList.addAll(array);
    }

    private void haveGo() {
        //increase count every turn
        count++;
        //display round number
        turnCount.setText(new StringBuilder().append(count).append("/").append(goCount));

        //when count is greater than goCount, level is complete
        if (count > goCount) {
            //change to game complete screen
            SharedCode.gameComplete(cardString, this, nextButton, homeButton, tryAgainButton, turnCount);
            answerButton.setVisibility(View.INVISIBLE);
            //check if there is an array for the next level
            if (levelSelect(nextLevel).size() > 0) {
                //set next level button to visible
                nextLevelButton.setVisibility(View.VISIBLE);
            }
        }
        //when count is less than goCount, display random lyric
        else {
            answerButton.setVisibility(View.VISIBLE);
            //hide next button
            nextButton.setVisibility(View.INVISIBLE);
            //get random lyric and answers
            card = SharedCode.getCard(tempCards);
            //catch null pointer exception
            if (card != null) {
                //split string to get just the question
                String[] turnList = card.split(System.lineSeparator());
                question = turnList[0];
                //get answer
                String[] answer = turnList[3].split(" - ");
                answerString = answer[0];
                //display the lyric
                cardString.setText(question);
            } else {
                //if null, send to home activity
                SharedCode.goHome(this);
            }
        }
    }

    private void configureButtons() {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                haveGo();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardString.setText(question);
                nextButton.setVisibility(View.INVISIBLE);
                backButton.setVisibility(View.INVISIBLE);
                answerButton.setVisibility(View.VISIBLE);
            }
        });

        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardString.setText(answerString);
                answerButton.setVisibility(View.INVISIBLE);
                //hide next button
                nextButton.setVisibility(View.VISIBLE);
            }
        });

        tryAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset the card list
                tempCards = SharedCode.resetList(tempCards, resetList, goCount);
                //reset round number and call playAgain function
                count = SharedCode.playAgain(nextButton, tryAgainButton, homeButton, turnCount);
                nextLevelButton.setVisibility(View.INVISIBLE);
                //set lyric string to random lyric
                haveGo();
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedCode.goHome(CardScreen.this);
            }
        });

    }

    private ArrayList<String> levelSelect(int level) {
        //arraylist to store songs from selected level
        ArrayList<String> selectedLevel = new ArrayList<>();
        switch (level) {
            //CO510 level 1
            case 5101:
                selectedLevel = listCO510.getLevel1List();
                break;
            case 5102:
                selectedLevel = listCO510.getLevel2List();
                break;
            case 5103:
                selectedLevel = listCO510.getLevel3List();
                break;
            case 5104:
                selectedLevel = listCO510.getLevel4List();
                break;
            case 5105:
                selectedLevel = listCO510.getLevel5List();
                break;
            case 5106:
                selectedLevel = listCO510.getLevel6List();
                break;
            case 5107:
                selectedLevel = listCO510.getLevel7List();
                break;
            case 5108:
                selectedLevel = listCO510.getLevel8List();
                break;
            case 5109:
                selectedLevel = listCO510.getLevel9List();
                break;
            case 51010:
                selectedLevel = listCO510.getLevel10List();
                break;
            case 51011:
                selectedLevel = listCO510.getLevel11List();
                break;
            case 51012:
                selectedLevel = listCO510.getLevel12List();
                break;
            case 51013:
                selectedLevel = listCO510.getLevel13List();
                break;
            case 51014:
                selectedLevel = listCO510.getLevel14List();
                break;
            case 51015:
                selectedLevel = listCO510.getLevel15List();
                break;
            case 5181:
                selectedLevel = listCO518.getLevel1List();
                break;
            case 5182:
                selectedLevel = listCO518.getLevel2List();
                break;
            case 5183:
                selectedLevel = listCO518.getLevel3List();
                break;
            case 5184:
                selectedLevel = listCO518.getLevel4List();
                break;
            case 5185:
                selectedLevel = listCO518.getLevel5List();
                break;
            case 5186:
                selectedLevel = listCO518.getLevel6List();
                break;
            case 5187:
                selectedLevel = listCO518.getLevel7List();
                break;
            case 5188:
                selectedLevel = listCO518.getLevel8List();
                break;
            case 5189:
                selectedLevel = listCO518.getLevel9List();
                break;
            case 51810:
                selectedLevel = listCO518.getLevel10List();
                break;
            case 51811:
                selectedLevel = listCO518.getLevel11List();
                break;
            case 51812:
                selectedLevel = listCO518.getLevel12List();
                break;
            case 51813:
                selectedLevel = listCO518.getLevel13List();
                break;
            case 51814:
                selectedLevel = listCO518.getLevel14List();
                break;
            case 51815:
                selectedLevel = listCO518.getLevel15List();
                break;
            case 5191:
                selectedLevel = listCO518.getLevel1List();
                break;
            case 5192:
                selectedLevel = listCO518.getLevel2List();
                break;
            case 5193:
                selectedLevel = listCO518.getLevel3List();
                break;
            case 5194:
                selectedLevel = listCO518.getLevel4List();
                break;
            case 5195:
                selectedLevel = listCO518.getLevel5List();
                break;
            case 5196:
                selectedLevel = listCO518.getLevel6List();
                break;
            case 5197:
                selectedLevel = listCO518.getLevel7List();
                break;
            case 5198:
                selectedLevel = listCO518.getLevel8List();
                break;
            case 5199:
                selectedLevel = listCO518.getLevel9List();
                break;
            case 51910:
                selectedLevel = listCO518.getLevel10List();
                break;
            case 51911:
                selectedLevel = listCO518.getLevel11List();
                break;
            case 51912:
                selectedLevel = listCO518.getLevel12List();
                break;
            case 51913:
                selectedLevel = listCO518.getLevel13List();
                break;
            case 51914:
                selectedLevel = listCO518.getLevel14List();
                break;
            case 51915:
                selectedLevel = listCO518.getLevel15List();
                break;
        }
        return selectedLevel;
    }
}
