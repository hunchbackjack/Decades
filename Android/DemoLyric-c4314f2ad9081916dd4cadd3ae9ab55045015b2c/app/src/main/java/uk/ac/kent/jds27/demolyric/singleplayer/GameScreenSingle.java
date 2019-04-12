package uk.ac.kent.jds27.demolyric.singleplayer;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

import me.xdrop.fuzzywuzzy.FuzzySearch;
import uk.ac.kent.jds27.demolyric.MainActivity;
import uk.ac.kent.jds27.demolyric.R;
import uk.ac.kent.jds27.demolyric.SharedCode;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.EightList;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.FiveList;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.NinetyList;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.SevenList;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.SixList;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.TenList;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.TwentyList;

@SuppressWarnings("ALL")
public class GameScreenSingle extends AppCompatActivity {

    //google ad to load when game completed
    private InterstitialAd mInterstitialAd;

    //variable to access shared code
    private final SharedCode access = new SharedCode();

    //list to hold lyrics to current game
    private ArrayList<String> tempSongs = new ArrayList<>();
    //list to reset lyrics when resetting game
    private final ArrayList<String> resetList = new ArrayList<>();

    //buttons
    private Button nextButton;
    private Button playAgainButton;
    private Button homeButton;
    private Button submitButton;
    private Button skipButton;

    //edit texts
    private EditText enterName;
    private EditText enterArtist;

    //strings
    private String songName;
    private String songArtist;
    private String turn;

    //text view
    private TextView lyricString;
    private TextView turnCount;

    //int to keep track of round number
    private int count = 0;
    //varibale to store the level
    private int currentLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_screen_single);

        lyricString = findViewById(R.id.lyricString);
        turnCount = findViewById(R.id.turnCount);
        nextButton = findViewById(R.id.nextButton);
        playAgainButton = findViewById(R.id.playAgainButton);
        homeButton = findViewById(R.id.homeButton);
        enterName = findViewById(R.id.enterName);
        enterArtist = findViewById(R.id.enterArtist);
        submitButton = findViewById(R.id.submitButton);
        skipButton = findViewById(R.id.skipButton);

        //initialise input variables
        songName = null;
        songArtist = null;

        //varibale to access 1950's lyrics
        FiveList list50 = new FiveList();
        //varibale to access 1950's lyrics
        SixList list60 = new SixList();
        //varibale to access 1950's lyrics
        SevenList list70 = new SevenList();
        //variable to access 1980's lyrics
        EightList list80 = new EightList();
        //variable to access 1990's lyrics
        NinetyList list90 = new NinetyList();
        //variable to access 2000's lyrics
        TwentyList list20 = new TwentyList();
        //variable to access 2010's lyrics
        TenList list10 = new TenList();

        //determine level to play
        switch (DecadeLevelSelect.levelSelect) {
            //1950 level 1
            case 501:
                getLevelList(list50.getLevel1List());
                break;
            //1950 level 2
            case 502:
                getLevelList(list50.getLevel2List());
                break;
            //1960 level 1
            case 601:
                getLevelList(list60.getLevel1List());
                break;
            //1960 level 2
            case 602:
                getLevelList(list60.getLevel2List());
                break;
            //1970 level 1
            case 701:
                getLevelList(list70.getLevel1List());
                break;
            //1970 level 2
            case 702:
                getLevelList(list70.getLevel2List());
                break;
            //1970 level 3
            case 703:
                getLevelList(list70.getLevel3List());
                break;
            //1980 level 1
            case 801:
                getLevelList(list80.getLevel1List());
                break;
            //1980 level 2
            case 802:
                getLevelList(list80.getLevel2List());
                break;
            //1980 level 3
            case 803:
                getLevelList(list80.getLevel3List());
                break;
            //1990 level 1
            case 901:
                getLevelList(list90.getLevel1List());
                break;
            //1990 level 2
            case 902:
                getLevelList(list90.getLevel2List());
                break;
            //1990 level 3
            case 903:
                getLevelList(list90.getLevel3List());
                break;
            //2000 level 1
            case 201:
                getLevelList(list20.getLevel1List());
                break;
            //2000 level 2
            case 202:
                getLevelList(list20.getLevel2List());
                break;
            //2000 level 3
            case 203:
                getLevelList(list20.getLevel3List());
                break;
            //2000 level 4
            case 204:
                getLevelList(list20.getLevel4List());
                break;
            //2000 level 5
            case 205:
                getLevelList(list20.getLevel5List());
                break;
            //2000 level 6
            case 206:
                getLevelList(list20.getLevel6List());
                break;
            //2000 level 7
            case 207:
                getLevelList(list20.getLevel7List());
                break;
            //2000 level 8
            case 208:
                getLevelList(list20.getLevel8List());
                break;
            //2000 level 9
            case 209:
                getLevelList(list20.getLevel9List());
                break;
            //2010 level 1
            case 101:
                getLevelList(list10.getLevel1List());
                break;
            //2010 level 2
            case 102:
                getLevelList(list10.getLevel2List());
                break;
            //2010 level 3
            case 103:
                getLevelList(list10.getLevel3List());
                break;
            //2010 level 4
            case 104:
                getLevelList(list10.getLevel4List());
                break;
            //2010 level 5
            case 105:
                getLevelList(list10.getLevel5List());
                break;
            //2010 level 6
            case 106:
                getLevelList(list10.getLevel6List());
                break;
            //2010 level 7
            case 107:
                getLevelList(list10.getLevel7List());
                break;
            //2010 level 8
            case 108:
                getLevelList(list10.getLevel8List());
                break;
            //2010 level 9
            case 109:
                getLevelList(list10.getLevel9List());
                break;
        }

        //initialise lyric string
        haveGo(nextButton);

        //set current level as level selected
        currentLevel = DecadeLevelSelect.levelSelect;

        //reset the level select
        DecadeLevelSelect.levelSelect = 0;

        //load interstitial ad
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

    /*
     * Method to add all songs from an array to tempSongs and resetList
     * @param ArrayList array
     */
    public void getLevelList(ArrayList<String> array) {
        tempSongs.clear();
        resetList.clear();
        tempSongs.addAll(array);
        resetList.addAll(array);
    }

    /*
     * Method to initiate a round.
     * Checks if count is greater than number of rounds, if so then game is complete.
     * If count is >= number of rounds then a random lyric is displayed.
     * @param View view
     */
    public void haveGo(View view) {
        //increase count every turn
        count++;
        //display round number
        //total number of rounds
        int goCount = 10;
        turnCount.setText(new StringBuilder().append(count).append("/").append(goCount));

        //when count is greater than goCount, level is complete
        if (count > goCount) {
            //show an advert
            SharedCode.showAd(mInterstitialAd);
            //load new advert for next time
            mInterstitialAd = SharedCode.loadAd(this);
            //change to game complete screen
            SharedCode.gameComplete(lyricString, this, nextButton, homeButton, playAgainButton);
            //add level to completed array
            MainActivity.addCompletedLevel(currentLevel);
            //reset the song list
            tempSongs = SharedCode.resetList(tempSongs, resetList, goCount);
        }
        //when count is less than goCount, display random lyric
        else {
            //reset enter artist and name fields
            enterArtist.setText("");
            enterName.setText("");
            //show artist and name text fields, and submit and skip buttons
            enterArtist.setVisibility(View.VISIBLE);
            enterName.setVisibility(View.VISIBLE);
            submitButton.setVisibility(View.VISIBLE);
            skipButton.setVisibility(View.VISIBLE);
            //hide next button
            nextButton.setVisibility(View.INVISIBLE);
            //get random lyric and answers
            turn = access.getLyric(tempSongs);
            //catch null pointer exception
            if(turn != null) {
                //split string to get just the lyric
                String[] turnList = turn.split(System.lineSeparator());
                String lyric = turnList[0];
                //get song name
                String[] answer = turnList[3].split(" - ");
                songName = answer[0];
                //split string to get the artist
                String[] getArtist = answer[1].split(" \\(");
                songArtist = getArtist[0];
                //display the lyric
                lyricString.setText(lyric);
            }
            else {
                //if null, send to home activity
                SharedCode.goHome(this);
            }
        }
    }

    /*
     * Method for submitting answers.
     * Compares the submitted values to the answers to get a fuzzy score.
     * If they are 80% accurate the answer is correct.
     * @param View view
     */
    public void submit(View view) {
        //score for match on artist input and answer
        int artistMatch = fuzzyMatch(enterArtist.getText().toString(), songArtist);
        //score for match on song name input and answer
        int nameMatch = fuzzyMatch(enterName.getText().toString(), songName);
        //check that both are over 80%
        if (artistMatch >= 80 && nameMatch >= 80) {
            //hide input buttons and submit
            submitButton.setVisibility(View.INVISIBLE);
            skipButton.setVisibility(View.INVISIBLE);
            enterArtist.setVisibility(View.INVISIBLE);
            enterName.setVisibility(View.INVISIBLE);
            //make next button visible and display correct message
            nextButton.setVisibility(View.VISIBLE);
            lyricString.setText(getString(R.string.correct));
        }
        //if match isn't at least 80% display toast notification
        else {
            Toast toast = Toast.makeText(this, "Incorrect", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    /*
     * Method to skip a go.
     * Displays an advert, then shows the answer.
     * @param View view
     */
    public void skipGo(View view) {
        //check advert is loaded
        if (mInterstitialAd.isLoaded()) {
            //show advert
            mInterstitialAd.show();

            //load new advert for next time
            mInterstitialAd = new InterstitialAd(this);
            mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        //display answer after 1 second to give the ad time to load
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //display answer
                lyricString.setText(turn);
                //set enter fields and buttons to invisible
                enterArtist.setVisibility(View.INVISIBLE);
                enterName.setVisibility(View.INVISIBLE);
                submitButton.setVisibility(View.INVISIBLE);
                skipButton.setVisibility(View.INVISIBLE);
                //make next button visible
                nextButton.setVisibility(View.VISIBLE);
            }
        }, 1000);
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
        haveGo(playAgainButton);
    }

    /*
     * Method to go back to the home screen.
     * @param View view
     */
    public void goHome(View view) {
        SharedCode.goHome(this);
    }

    /*
     * Method to fuzzy match two strings.
     * Uses separate library, check dependencies.
     * @param String x, String y
     */
    @SuppressWarnings("unused")
    private int fuzzyMatch(String x, String y) {
        //make both strings lower case for more accurate match
        String a = x.toLowerCase();
        String b = y.toLowerCase();
        return FuzzySearch.ratio(a, b);
    }
}

