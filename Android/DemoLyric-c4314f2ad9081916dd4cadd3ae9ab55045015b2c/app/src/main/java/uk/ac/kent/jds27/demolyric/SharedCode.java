package uk.ac.kent.jds27.demolyric;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;
import java.util.Random;

import uk.ac.kent.jds27.demolyric.singleplayer.DecadeLevelSelect;

/*
 * Class to store shared code for the project
 */
public class SharedCode {

    /*
     * Method to get random string from an array.
     * @param ArrayList<String> array
     */
    public String getLyric(ArrayList<String> array) {
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
     * Method to configure a button.
     * sets the onclick listener to set the levelSelect variable, and point to the destination class
     * @param Button button, Context context, Class destination, int level, all final
     */
    public static void configureButton(final Button button, final Context context, final Class destination, final int level) {
        //set backgroundColor
        button.setBackgroundColor(ContextCompat.getColor(context, R.color.colorPrimary));
        //set on click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set levelSelect variable
                DecadeLevelSelect.levelSelect = level;
                //changes activity
                context.startActivity(new Intent(context, destination));
            }
        });
    }

    /*
     * Method to show game completed screen
     * @param TextView lyricString, Context context, Button nextButton, Button homeButton, Button playAgainButton
     */
    public static void gameComplete(TextView lyricString, Context context, Button nextButton, Button homeButton, Button playAgainButton) {
        lyricString.setText(context.getString(R.string.game_complete));
        nextButton.setVisibility(View.INVISIBLE);
        homeButton.setVisibility(View.VISIBLE);
        playAgainButton.setVisibility(View.VISIBLE);
    }

    /*
     * Method to reset the tempSongs list
     * @param ArrayList<String> tempSongs, ArrayList<String> resetList, int goCount
     */
    public static ArrayList<String> resetList(ArrayList<String> tempSongs, ArrayList<String> resetList, int goCount) {
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
    public static void showAd(InterstitialAd mInterstitialAd) {
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
    public static InterstitialAd loadAd(Context context) {
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
    public static int playAgain(Button nextButton, Button playAgainButton, Button homeButton) {
        //reset the round number
        int count = 0;
        //display next button
        nextButton.setVisibility(View.VISIBLE);
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
    public static void goHome(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }

    /*
     * Method to unlock level.
     */
    public static void unlockLevel(Button levelButton, final Context context, final Class destination, final int level) {
        Log.d("unlocklevel", "level " + level);
        Integer prevLevel = level-1;
        Boolean found = false;
        for(Integer lev : MainActivity.getCompletedLevels()) {
            Log.d("unlocklevel", "lev " + lev);
            Log.d("unlocklevel", "prevLevel " + prevLevel);
            if(lev.equals(prevLevel)) {
                Log.d("unlocklevel", "found  " + found);
                found = true;
                configureButton(levelButton, context, destination, level);
            }
        }
    }
}

