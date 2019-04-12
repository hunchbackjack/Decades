package uk.ac.kent.jds27.demolyric.multiplayer;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

import uk.ac.kent.jds27.demolyric.R;
import uk.ac.kent.jds27.demolyric.SharedCode;

/*
 * Class to deal with the game functions
 */
public class GameScreen extends AppCompatActivity {

    //interstitial ad to load after game complete
    private InterstitialAd mInterstitialAd;

    //variable to access the lyrics
    private final LyricAndAnswers la = new LyricAndAnswers();

    //variable to access shared code
    private final SharedCode access = new SharedCode();

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

        cTimer = null;

        //check which decades have been selected and add to lists
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

        //set initial lyric
        haveGo(nextButton);

        //load interstitial ad
        mInterstitialAd = SharedCode.loadAd(this);
    }

    /*
     * Method to initiate a round.
     * Checks if count is greater than number of rounds, if so then game is complete.
     * If count is >= number of rounds then a random lyric is displayed.
     * @param View view
     */
    @SuppressWarnings({"WeakerAccess", "unused"})
    public void haveGo(View view) {
        //increase round number
        count++;
        //check if round number is less than total number of rounds
        if (count <= goCount) {
            //display round number
            turnCount.setText(new StringBuilder().append(count).append("/").append(goCount));
        }
        //cancel timer from previous round
        if (cTimer != null) {
            cTimer.cancel();
        }
        //check if round number is greater than total number of rounds
        if (count > goCount) {
            //show an advert
            SharedCode.showAd(mInterstitialAd);
            //load new advert for next time
            mInterstitialAd = SharedCode.loadAd(this);
            //change to game complete screen
            SharedCode.gameComplete(lyricString, this, nextButton, homeButton, playAgainButton);
            //reset the song list
            tempSongs = SharedCode.resetList(tempSongs, resetList, goCount);
        }
        //if round number is less than total number of rounds initiate a new round
        else {
            //make listSize equal to total number of songs left in tempSongs
            listSize = tempSongs.size();
            //get new song string
            String turn = access.getLyric(tempSongs);
            //display the new song
            lyricString.setText(turn);
            //initiate a new count down
            cTimer = new CountDownTimer(timeCount, 1000) {

                @SuppressLint("SetTextI18n")
                public void onTick(long millisUntilFinished) {
                    timer.setText("" + millisUntilFinished / 1000);
                }

                public void onFinish() {
                    timer.setText(getString(R.string.zero));
                }
            }.start();
        }
    }

    /*
     * Method to start the game again.
     * Resets the count to 0 and initiates the game with haveGo().
     * @param View view
     */
    public void playAgain(View view) {
        //reset round number and call playAgain function
        count = SharedCode.playAgain(nextButton, playAgainButton, homeButton);
        //set lyric string to random lyric
        haveGo(nextButton);
    }

    /*
     * Method to go back to the home screen.
     * @param View view
     */
    public void goHome(View view) {
        SharedCode.goHome(this);
    }

    /*
     * Method to display edit texts to input new timer value
     * @param View view
     */
    public void changeTimeCount(View view) {
        editTime.setVisibility(View.VISIBLE);
        timeSubmit.setVisibility(View.VISIBLE);
    }

    /*
     * Method to change time per round
     * @param View view
     */
    public void submitTimeCount(View view) {
        //get user input string
        String value = editTime.getText().toString();
        //check that user input is a number
        try {
            //get the input value as int
            int time = Integer.parseInt(value);
            //set time count
            timeCount = time * 1000;
        }
        //handle exception if not a number
        catch (NumberFormatException ex) {
            //display popup error message
            Toast toast = Toast.makeText(this, "Please input a number", Toast.LENGTH_LONG);
            toast.show();
        }

        //hide edit texts
        editTime.setVisibility(View.INVISIBLE);
        timeSubmit.setVisibility(View.INVISIBLE);
    }

    /*
     * Method to display edit texts to input new number of rounds
     * @param View view
     */
    public void changeTurnCount(View view) {
        editTurn.setVisibility(View.VISIBLE);
        turnSubmit.setVisibility(View.VISIBLE);
    }

    /*
     * Method to change number of rounds
     * @param View view
     */
    public void submitTurnCount(View view) {
        //get user input value
        String value = editTurn.getText().toString();
        //check that user input is a number
        try {
            //get user input as an int
            int turn = Integer.parseInt(value);
            //check if number of turns is greater than number of songs in list
            if (turn > listSize) {
                //display popup error message
                Toast sizeToast = Toast.makeText(this, "Please input " + listSize + " or lower.", Toast.LENGTH_LONG);
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
            Toast toast = Toast.makeText(this, "Please input a number", Toast.LENGTH_LONG);
            toast.show();
        }

        //hide edit texts
        editTurn.setVisibility(View.INVISIBLE);
        turnSubmit.setVisibility(View.INVISIBLE);
    }

    /*
     * Method to add songs from specified decades into the game
     * @param ArrayList<String> array
     */
    private void addDecade(ArrayList<String> array) {
        tempSongs.addAll(array);
        resetList.addAll(array);
    }
}
