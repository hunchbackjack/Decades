package uk.ac.kent.jds27.demolyric;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;
import java.util.Random;

public class Game extends AppCompatActivity {

    /*
     * Method to get random string from an array.
     * @param ArrayList<String> array
     */
    protected String getLyric(ArrayList<String> array) {
        //set lyric to null to avoid not initialised error
        String randomLyric = null;
        //check that array size is greater than 0 to avoid null pointer exception
        if (array.size() > 0) {
            //get random index
            Random rand = new Random();
            int index = rand.nextInt(array.size());
            //retrieve random string
            for (String lyric : array) {
                if (index == array.indexOf(lyric)) {
                    randomLyric = lyric;
                }
            }
            //remove the string from the array
            array.remove(index);
        }
        //return the string
        return randomLyric;
    }

    /*
     * Method to show game completed screen
     * @param TextView lyricString, Context context, Button nextButton, Button homeButton, Button playAgainButton
     */
    protected static void gameComplete(TextView lyricString, Context context, Button nextButton, Button homeButton, Button playAgainButton, TextView turnCount) {
        //display "Game complete!"
        lyricString.setText(context.getString(R.string.game_complete));
        //hide unused buttons
        nextButton.setVisibility(View.INVISIBLE);
        turnCount.setVisibility(View.INVISIBLE);
        //show needed buttons
        homeButton.setVisibility(View.VISIBLE);
        playAgainButton.setVisibility(View.VISIBLE);
    }

    /*
     * Method to reset the tempSongs list
     * @param ArrayList<String> tempSongs, ArrayList<String> resetList, int goCount
     */
    protected static ArrayList<String> resetList(ArrayList<String> tempSongs, ArrayList<String> resetList, int goCount) {
        // when list size is less than the number of turns in a round, reset the list
        if (tempSongs.size() <= goCount) {
            tempSongs.clear();
            tempSongs.addAll(resetList);
        }
        //return the new list
        return tempSongs;
    }

    /*
     * Method to load and show an interstitial advert
     * @param InterstitialAd mInterstitialAd, Context context
     */
    protected static void showAd(InterstitialAd mInterstitialAd) {
        //display interstitial ad
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            //interstitial ad couldn't load
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }

    /*
     * Method to load an interstitial advert
     * @param Context context
     */
    protected static InterstitialAd loadAd(Context context) {
        InterstitialAd mInterstitialAd = new InterstitialAd(context);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        //return the new loaded advert
        return mInterstitialAd;
    }

    /*
     * Method to restart the game
     * @param Button nextButton, Button playAgainButton, Button homeButton
     */
    protected static int playAgain(Button nextButton, Button playAgainButton, Button homeButton, TextView turnCount) {
        //reset the round number
        int count = 0;
        //display next button
        nextButton.setVisibility(View.VISIBLE);
        turnCount.setVisibility(View.VISIBLE);
        //hide play again and home buttons
        playAgainButton.setVisibility(View.INVISIBLE);
        homeButton.setVisibility(View.INVISIBLE);
        //return new count
        return count;
    }

    /*
     * Method to return to the MainActivity
     * @param Context context
     */
    protected static void goHome(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }
}
