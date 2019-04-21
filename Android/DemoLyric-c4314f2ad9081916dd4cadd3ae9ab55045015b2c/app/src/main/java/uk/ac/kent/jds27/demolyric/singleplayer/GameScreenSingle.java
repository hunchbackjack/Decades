package uk.ac.kent.jds27.demolyric.singleplayer;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import java.util.ArrayList;

import me.xdrop.fuzzywuzzy.FuzzySearch;
import uk.ac.kent.jds27.demolyric.R;
import uk.ac.kent.jds27.demolyric.SharedCode;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.EightList;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.FiveList;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.NinetyList;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.SevenList;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.SixList;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.TenList;
import uk.ac.kent.jds27.demolyric.singleplayer.decadelists.TwentyList;

public class GameScreenSingle extends AppCompatActivity {

    //shared preference to reference levels completed
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;
    //shared preference to reference number of skips
    private SharedPreferences skipCount;

    //google ad to load when game completed
    private InterstitialAd mInterstitialAd;

    //google ad to load when skipping
    private RewardedVideoAd mRewardedVideoAd;

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
    private Button nextLevelButton;

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
    private TextView skipView;

    //int to keep track of round number
    private int count = 0;
    //variable to store the level
    private int currentLevel;
    //variable to store total number of rounds
    private int goCount;

    private int nextLevel;

    //variable to access 1950's lyrics
    private FiveList list50;
    //variable to access 1950's lyrics
    private SixList list60;
    //variable to access 1950's lyrics
    private SevenList list70;
    //variable to access 1980's lyrics
    private EightList list80;
    //variable to access 1990's lyrics
    private NinetyList list90;
    //variable to access 2000's lyrics
    private TwentyList list20;
    //variable to access 2010's lyrics
    private TenList list10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_screen_single);

        lyricString = findViewById(R.id.lyricString);
        turnCount = findViewById(R.id.turnCount);
        skipView = findViewById(R.id.skipView);
        nextButton = findViewById(R.id.nextButton);
        playAgainButton = findViewById(R.id.playAgainButton);
        homeButton = findViewById(R.id.homeButton);
        enterName = findViewById(R.id.enterName);
        enterArtist = findViewById(R.id.enterArtist);
        submitButton = findViewById(R.id.submitButton);
        skipButton = findViewById(R.id.skipButton);
        nextLevelButton = findViewById(R.id.nextLevelButton);

        //initialise input variables
        songName = null;
        songArtist = null;

        //initialise list variables
        list50 = new FiveList();
        list60 = new SixList();
        list70 = new SevenList();
        list80 = new EightList();
        list90 = new NinetyList();
        list20 = new TwentyList();
        list10 = new TenList();

        //different variable names pointing to same variable for readability
        sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPref.edit();
        editor.apply();
        skipCount = PreferenceManager.getDefaultSharedPreferences(this);

        //determine level to play
        getLevelList(levelSelect(DecadeLevelSelect.levelSelect));

        //set current level
        currentLevel = DecadeLevelSelect.levelSelect;

        //set next level
        nextLevel = currentLevel + 1;

        //reset the level select
        DecadeLevelSelect.levelSelect = 0;

        //set the skip count
        newSkipCount();

        //load interstitial ad
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        //load rewarded ad
        //rewarded video ad functionality
        RewardedVideoAdListener listener = new RewardedVideoAdListener() {
            @Override
            public void onRewardedVideoAdLoaded() {
            }

            @Override
            public void onRewardedVideoAdOpened() {

            }

            @Override
            public void onRewardedVideoStarted() {

            }

            @Override
            public void onRewardedVideoAdClosed() {

            }

            @Override
            public void onRewarded(RewardItem rewardItem) {

            }

            @Override
            public void onRewardedVideoAdLeftApplication() {

            }

            @Override
            public void onRewardedVideoAdFailedToLoad(int i) {
                Toast toast = Toast.makeText(GameScreenSingle.this, "Skip video could not load", Toast.LENGTH_LONG);
                toast.show();
            }

            @Override
            public void onRewardedVideoCompleted() {
                //display answer
                lyricString.setText(turn);
                //set enter fields and buttons to invisible
                enterArtist.setVisibility(View.INVISIBLE);
                enterName.setVisibility(View.INVISIBLE);
                submitButton.setVisibility(View.INVISIBLE);
                skipButton.setVisibility(View.INVISIBLE);
                //make next button visible
                nextButton.setVisibility(View.VISIBLE);

                newSkipCount();
            }
        };

        //initialise advert
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.setRewardedVideoAdListener(listener);
        //load advert
        loadRewardedVideoAd();

        //set total number of rounds
        goCount = 10;

        //configure button functionality
        configureButtons();

        //initialise lyric string
        haveGo();

    }

    /*
     * Method to load the rewarded video ad
     */
    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917",
                new AdRequest.Builder().build());
    }

    /*
     * Method to add all songs from an array to tempSongs and resetList
     * @param ArrayList array
     */
    private void getLevelList(ArrayList<String> array) {
        //clear the current lists
        tempSongs.clear();
        resetList.clear();
        //reset them with the new array
        tempSongs.addAll(array);
        resetList.addAll(array);
    }

    /*
     * Method to initiate a round.
     * Checks if count is greater than number of rounds, if so then game is complete.
     * If count is >= number of rounds then a random lyric is displayed.
     * @param View view
     */
    private void haveGo() {
        loadRewardedVideoAd();
        //increase count every turn
        count++;
        //when count is greater than goCount, level is complete
        if (count > goCount) {
            //show an advert
            SharedCode.showAd(mInterstitialAd);
            //load new advert for next time
            mInterstitialAd = SharedCode.loadAd(this);
            //change to game complete screen
            SharedCode.gameComplete(lyricString, this, nextButton, homeButton, playAgainButton, turnCount);

            //check if current level is contained in sharedPref list
            if (!sharedPref.contains("Level completed" + currentLevel)) {
                //add current level to it
                addToSharedPreferences(currentLevel);
                //apply changes
                editor.apply();
            }

            //check if there is an array for the next level
            if (levelSelect(nextLevel).size() > 0) {
                //set next level button to visible
                nextLevelButton.setVisibility(View.VISIBLE);
            }
        }
        //when count is less than goCount, display random lyric
        else {
            //display round number
            turnCount.setText(new StringBuilder().append(count).append("/").append(goCount));
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
            if (turn != null) {
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
            } else {
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
        //if both matches aren't at least 80% display toast notification
        else if (artistMatch <= 80 && nameMatch <= 80){
            Toast toast = Toast.makeText(this, "Incorrect", Toast.LENGTH_LONG);
            toast.show();
        }
        //if artist match isn't at least 80% display toast notification
        else if (artistMatch <= 80) {
            Toast toast = Toast.makeText(this, "Incorrect artist", Toast.LENGTH_LONG);
            toast.show();
        }
        //if song name match isn't at least 80% display toast notification
        else {
            Toast toast = Toast.makeText(this, "Incorrect song name", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    /*
     * Method to skip a go.
     * Displays an advert, then shows the answer.
     * @param View view
     */
    public void skipGo(View view) {
        //check that skip count for current level is greater than 0
        if (skipCount.getInt("" + currentLevel, 0) > 0) {
            //check advert is loaded
            if (mRewardedVideoAd.isLoaded()) {
                //show advert
                mRewardedVideoAd.show();
                //load new advert for next time
                loadRewardedVideoAd();
            } else {
                Log.d("TAG", "The rewarded ad wasn't loaded yet.");
            }
        } else {
            //display error message
            Toast toast = Toast.makeText(this, "Out of skips", Toast.LENGTH_LONG);
            toast.show();
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
                //reset the song list
                tempSongs = SharedCode.resetList(tempSongs, resetList, goCount);
                //reset round number and call playAgain function
                count = SharedCode.playAgain(nextButton, playAgainButton, homeButton, turnCount);
                nextLevelButton.setVisibility(View.INVISIBLE);
                //set lyric string to random lyric
                haveGo();
            }
        });

        //set method for home button
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedCode.goHome(GameScreenSingle.this);
            }
        });

        //set method for next level button
        nextLevelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getLevelList(levelSelect(nextLevel));
                //reset round number and call playAgain function
                count = SharedCode.playAgain(nextButton, playAgainButton, homeButton, turnCount);
                haveGo();
                nextLevelButton.setVisibility(View.INVISIBLE);
                DecadeLevelSelect.levelSelect = nextLevel;
                currentLevel = DecadeLevelSelect.levelSelect;
                nextLevel = currentLevel + 1;

            }
        });
    }

    /*
     * Method to fuzzy match two strings.
     * Uses separate library, check dependencies.
     * @param String x, String y
     */
    @SuppressWarnings("unused")
    private int fuzzyMatch(String x, String y) {
        //make both strings lower case for more accurate match
        String a = x.toLowerCase().trim();
        String b = y.toLowerCase().trim();
        return FuzzySearch.ratio(a, b);
    }

    /*
     * Method to add a variable to shared preferences list.
     * @param int i
     */
    private void addToSharedPreferences(int i) {
        editor.putInt("Level completed " + i, i).apply();
    }

    /*
     * Method to select the current level and return the array.
     * @param int level
     */
    private ArrayList<String> levelSelect(int level) {
        //arraylist to store songs from selected level
        ArrayList<String> selectedLevel = new ArrayList<>();
        switch (level) {
            //1950 level 1
            case 501:
                selectedLevel = list50.getLevel1List();
                break;
            //1950 level 2
            case 502:
                selectedLevel = list50.getLevel2List();
                break;
            //1960 level 1
            case 601:
                selectedLevel = list60.getLevel1List();
                break;
            //1960 level 2
            case 602:
                selectedLevel = list60.getLevel2List();
                break;
            //1970 level 1
            case 701:
                selectedLevel = list70.getLevel1List();
                break;
            //1970 level 2
            case 702:
                selectedLevel = list70.getLevel2List();
                break;
            //1970 level 3
            case 703:
                selectedLevel = list70.getLevel3List();
                break;
            //1970 level 4
            case 704:
                selectedLevel = list70.getLevel4List();
                break;
            //1980 level 1
            case 801:
                selectedLevel = list80.getLevel1List();
                break;
            //1980 level 2
            case 802:
                selectedLevel = list80.getLevel2List();
                break;
            //1980 level 3
            case 803:
                selectedLevel = list80.getLevel3List();
                break;
            //1990 level 1
            case 901:
                selectedLevel = list90.getLevel1List();
                break;
            //1990 level 2
            case 902:
                selectedLevel = list90.getLevel2List();
                break;
            //1990 level 3
            case 903:
                selectedLevel = list90.getLevel3List();
                break;
            //2000 level 1
            case 201:
                selectedLevel = list20.getLevel1List();
                break;
            //2000 level 2
            case 202:
                selectedLevel = list20.getLevel2List();
                break;
            //2000 level 3
            case 203:
                selectedLevel = list20.getLevel3List();
                break;
            //2000 level 4
            case 204:
                selectedLevel = list20.getLevel4List();
                break;
            //2000 level 5
            case 205:
                selectedLevel = list20.getLevel5List();
                break;
            //2000 level 6
            case 206:
                selectedLevel = list20.getLevel6List();
                break;
            //2000 level 7
            case 207:
                selectedLevel = list20.getLevel7List();
                break;
            //2000 level 8
            case 208:
                selectedLevel = list20.getLevel8List();
                break;
            //2000 level 9
            case 209:
                selectedLevel = list20.getLevel9List();
                break;
            //2010 level 1
            case 101:
                selectedLevel = list10.getLevel1List();
                break;
            //2010 level 2
            case 102:
                selectedLevel = list10.getLevel2List();
                break;
            //2010 level 3
            case 103:
                selectedLevel = list10.getLevel3List();
                break;
            //2010 level 4
            case 104:
                selectedLevel = list10.getLevel4List();
                break;
            //2010 level 5
            case 105:
                selectedLevel = list10.getLevel5List();
                break;
            //2010 level 6
            case 106:
                selectedLevel = list10.getLevel6List();
                break;
            //2010 level 7
            case 107:
                selectedLevel = list10.getLevel7List();
                break;
            //2010 level 8
            case 108:
                selectedLevel = list10.getLevel8List();
                break;
            //2010 level 9
            case 109:
                selectedLevel = list10.getLevel9List();
                break;
        }
        return selectedLevel;
    }

    /*
     * Method to refresh the skip count.
     */
    private void newSkipCount() {
        //get skipCount from shared preferences
        int skipNo = skipCount.getInt("" + currentLevel, 1);
        //create editor
        SharedPreferences.Editor editSkip = skipCount.edit();
        //decrease skip count by 1
        editSkip.putInt("" + currentLevel, skipNo - 1);
        editSkip.apply();
        //get new skip count
        int getSkipPrefs = skipCount.getInt(Integer.toString(currentLevel), 0);
        //concatenate variables
        String setSkips = getString(R.string.skips) + getSkipPrefs;
        //set the text field
        skipView.setText(setSkips);
    }
}


