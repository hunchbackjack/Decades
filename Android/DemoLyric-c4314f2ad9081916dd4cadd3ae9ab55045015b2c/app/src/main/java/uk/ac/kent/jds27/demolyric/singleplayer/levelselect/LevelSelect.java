package uk.ac.kent.jds27.demolyric.singleplayer.levelselect;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import uk.ac.kent.jds27.demolyric.R;
import uk.ac.kent.jds27.demolyric.singleplayer.DecadeLevelSelect;

public class LevelSelect extends AppCompatActivity {

    /*
     * Method to configure a level select button.
     * sets the onclick listener to set the levelSelect variable, and point to the destination class
     * @param Button button, Context context, Class destination, int level, all final
     */
    static void configureLevelButton(final Button button, final Context context, final Class destination, final int level) {
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
     * Method to unlock level.
     */
    void unlockLevel(Button levelButton, final Context context, final Class destination, final int level) {
        //get previous level
        int prevLevel = level-1;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        //check if preferences contains previous level
        if(preferences.contains("Level completed " + prevLevel)) {
            //unlock button
            configureLevelButton(levelButton, context, destination, level);
        }
    }

}
