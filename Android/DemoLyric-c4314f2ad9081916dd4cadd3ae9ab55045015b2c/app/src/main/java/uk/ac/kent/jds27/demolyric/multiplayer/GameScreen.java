package uk.ac.kent.jds27.demolyric.multiplayer;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

import uk.ac.kent.jds27.demolyric.Game;
import uk.ac.kent.jds27.demolyric.R;

/*
 * Class to deal with the game functions
 */
public class GameScreen extends Game {

    //interstitial ad to load after game complete
    private InterstitialAd mInterstitialAd;

    //variable to access the lyrics
    private final LyricAndAnswers la = new LyricAndAnswers();

    //list to store all the current lyrics
    private ArrayList<String> tempSongs = new ArrayList<>();
    //list to store current lyrics to reset tempSongs
    private final ArrayList<String> resetList = new ArrayList<>();

    //buttons
    private Button nextButton;
    private Button playAgainButton;
    private Button homeButton;
    private Button turnSubmit;
    private Button timeSubmit;
    private Button timeButton;
    private Button countButton;

    //edit texts
    private EditText editTurn;
    private EditText editTime;

    //text views
    private TextView lyricString;
    private TextView turnCount;
    private TextView timer;

    //int to store round number
    private int count = 0;
    //int to store total number of rounds
    private int goCount = 20;
    //int to store amount of time per round
    private int timeCount = 21000;
    //int to store list size
    private int listSize;

    //countdown timer for the rounds
    private CountDownTimer cTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_screen);

        lyricString = findViewById(R.id.lyricString);
        turnCount = findViewById(R.id.turnCount);
        nextButton = findViewById(R.id.nextButton);
        playAgainButton = findViewById(R.id.playAgainButton);
        editTurn = findViewById(R.id.editTurn);
        turnSubmit = findViewById(R.id.turnSubmit);
        timer = findViewById(R.id.timer);
        timeSubmit = findViewById(R.id.timeSubmit);
        editTime = findViewById(R.id.editTime);
        homeButton = findViewById(R.id.homeButton);
        timeButton = findViewById(R.id.timerButton);
        countButton = findViewById(R.id.countButton);

        cTimer = null;

        //check which decades have been selected and add to lists
        checkDecades();

        //set methods for all buttons
        configureButtons();

        //set initial lyric
        haveGo();

        //load interstitial ad
        mInterstitialAd = loadAd(this);
    }

    /*
     * Method to initiate a round.
     * Checks if count is greater than number of rounds, if so then game is complete.
     * If count is >= number of rounds then a random lyric is displayed.
     * @param View view
     */
    @SuppressWarnings({"WeakerAccess", "unused"})
    public void haveGo() {
        //increase round number
        count++;
        //cancel timer from previous round
        if (cTimer != null) {
            cTimer.cancel();
        }
        //check if round number is greater than total number of rounds
        if (count > goCount) {
            //show an advert
            showAd(mInterstitialAd);
            //load new advert for next time
            mInterstitialAd = loadAd(this);
            //change to game complete screen
            gameComplete(lyricString, this, nextButton, homeButton, playAgainButton, turnCount);
            //check if there's enough songs in list to do another round
            if (tempSongs.size() < goCount) {
                //reset the song list
                //noinspection ConstantConditions
                tempSongs = resetList(tempSongs, resetList, goCount);
            }
        }
        //if round number is less than total number of rounds initiate a new round
        else {
            //display round number
            turnCount.setText(new StringBuilder().append(count).append("/").append(goCount));
            //make listSize equal to total number of songs left in tempSongs
            listSize = tempSongs.size();
            //get new song string
            String turn = getLyric(tempSongs);
            //display the new song
            lyricString.setText(turn);
            //initiate a new count down
            cTimer = new CountDownTimer(timeCount, 1000) {
                public void onTick(long millisUntilFinished) {
                    String newTime = "" + millisUntilFinished / 1000;
                    timer.setText(newTime);
                }
                public void onFinish() {
                    timer.setText(getString(R.string.zero));
                }
            }.start();
        }
    }

    /*
     * Method to set methods for all buttons.
     */
    private void configureButtons() {
        //set method for next button
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                haveGo();
            }
        });

        //set method for play again button
        playAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset round number and call playAgain function
                count = playAgain(nextButton, playAgainButton, homeButton, turnCount);
                //set lyric string to random lyric
                haveGo();
            }
        });

        //set method for home button
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHome(GameScreen.this);
            }
        });

        //set method to initiate timer change
        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make submit button and edit text visible
                editTime.setVisibility(View.VISIBLE);
                timeSubmit.setVisibility(View.VISIBLE);
            }
        });

        //set method to submit time change
        timeSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get user input string
                int time = Integer.parseInt(editTime.getText().toString());
                //check that user input is a number
                try {
                    //set time count
                    timeCount = time * 1000;
                }
                //handle exception if not a number
                catch (NumberFormatException ex) {
                    //display popup error message
                    Toast toast = Toast.makeText(GameScreen.this, "Please input a number", Toast.LENGTH_LONG);
                    toast.show();
                }

                //hide edit texts
                editTime.setVisibility(View.INVISIBLE);
                timeSubmit.setVisibility(View.INVISIBLE);
            }
        });

        //set method to initiate round count change
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make submit button and edit text visible
                editTurn.setVisibility(View.VISIBLE);
                turnSubmit.setVisibility(View.VISIBLE);
            }
        });

        //set method to submit round count change
        turnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get user input value
                int turn = Integer.parseInt(editTurn.getText().toString());
                //check that user input is a number
                try {
                    //check if number of turns is greater than number of songs in list
                    if (turn > listSize) {
                        //display popup error message
                        Toast sizeToast = Toast.makeText(GameScreen.this, "Please input " + listSize + " or lower.", Toast.LENGTH_LONG);
                        sizeToast.show();
                    }
                    //check if number of turns is less than or equal to number of songs in list
                    else {
                        //change number of rounds to specified user input
                        goCount = turn;
                    }
                }
                //handle exception if not a number
                catch (NumberFormatException ex) {
                    //display popup error message
                    Toast toast = Toast.makeText(GameScreen.this, "Please input a number", Toast.LENGTH_LONG);
                    toast.show();
                }

                //hide edit texts
                editTurn.setVisibility(View.INVISIBLE);
                turnSubmit.setVisibility(View.INVISIBLE);
            }
        });

    }

    /*
     * Method to add songs from specified decades into the game.
     * @param ArrayList<String> array
     */
    private void addDecade(ArrayList<String> array) {
        tempSongs.addAll(array);
        resetList.addAll(array);
    }

    /*
     * Method to check which decades have been selected and add them to song list.
     */
    private void checkDecades() {
        if (DecadeSelect.fiveClicked) {
            addDecade(la.getFiveList());
        }
        if (DecadeSelect.sixClicked) {
            addDecade(la.getSixList());
        }
        if (DecadeSelect.sevenClicked) {
            addDecade(la.getSevenList());
        }
        if (DecadeSelect.eightClicked) {
            addDecade(la.getEightList());
        }
        if (DecadeSelect.nineClicked) {
            addDecade(la.getNineList());
        }
        if (DecadeSelect.twentyClicked) {
            addDecade(la.getTwentyList());
        }
        if (DecadeSelect.tenClicked) {
            addDecade(la.getTenList());
        }
    }
}
