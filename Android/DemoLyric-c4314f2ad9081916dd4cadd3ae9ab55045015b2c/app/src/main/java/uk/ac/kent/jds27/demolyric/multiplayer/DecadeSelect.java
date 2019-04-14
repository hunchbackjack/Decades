package uk.ac.kent.jds27.demolyric.multiplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import uk.ac.kent.jds27.demolyric.R;

/*
 * Class for selecting a decade
 */
public class DecadeSelect extends AppCompatActivity {

    //booleans to keep track of what has been selected
    public static boolean fiveClicked;
    public static boolean sixClicked;
    public static boolean sevenClicked;
    public static boolean eightClicked;
    public static boolean nineClicked;
    public static boolean twentyClicked;
    public static boolean tenClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_decade_select);

        //initialise booleans
        fiveClicked = false;
        sixClicked = false;
        sevenClicked = false;
        eightClicked = false;
        nineClicked = false;
        twentyClicked = false;
        tenClicked = false;
    }

    /*
     * Method to add 1950's lyrics
     * @param View view
     */
    public void addFifties(View view) {
        //call colour change method
        changeButtonColour(view, fiveClicked);
        //change decade clicked boolean
        //noinspection RedundantIfStatement
        if (!fiveClicked) {
            fiveClicked = true;
        } else {
            fiveClicked = false;
        }
    }

    /*
     * Method to add 1960's lyrics
     * @param View view
     */
    public void addSixties(View view) {
        //call colour change method
        changeButtonColour(view, sixClicked);
        //change decade clicked boolean
        //noinspection RedundantIfStatement
        if (!sixClicked) {
            sixClicked = true;
        } else {
            sixClicked = false;
        }
    }

    /*
     * Method to add 1970's lyrics
     * @param View view
     */
    public void addSeventies(View view) {
        //call colour change method
        changeButtonColour(view, sevenClicked);
        //change decade clicked boolean
        //noinspection RedundantIfStatement
        if (!sevenClicked) {
            sevenClicked = true;
        } else {
            sevenClicked = false;
        }
    }

    /*
     * Method to add 1980's lyrics
     * @param View view
     */
    public void addEighties(View view) {
        //call colour change method
        changeButtonColour(view, eightClicked);
        //change decade clicked boolean
        //noinspection RedundantIfStatement
        if (!eightClicked) {
            eightClicked = true;
        } else {
            eightClicked = false;
        }
    }

    /*
     * Method to add 1990's lyrics
     * @param View view
     */
    public void addNineties(View view) {
        //call colour change method
        changeButtonColour(view, nineClicked);
        //change decade clicked boolean
        //noinspection RedundantIfStatement
        if (!nineClicked) {
            nineClicked = true;
        } else {
            nineClicked = false;
        }
    }

    /*
     * Method to add 2000's lyrics
     * @param View view
     */
    public void addNoughties(View view) {
        //call colour change method
        changeButtonColour(view, twentyClicked);
        //change decade clicked boolean
        //noinspection RedundantIfStatement
        if (!twentyClicked) {
            twentyClicked = true;
        } else {
            twentyClicked = false;
        }
    }

    /*
     * Method to add 2010's lyrics
     * @param View view
     */
    public void addTens(View view) {
        //call colour change method
        changeButtonColour(view, tenClicked);
        //change decade clicked boolean
        //noinspection RedundantIfStatement
        if (!tenClicked) {
            tenClicked = true;
        } else {
            tenClicked = false;
        }
    }

    /*
     * Method to change a buttons colour
     * @param View view, Boolean button
     */
    private void changeButtonColour(View view, Boolean button) {
        //check if button has been selected
        if (!button) {
            //change to dark primary colour
            view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        } else {
            //change to primary colour
            view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
        }
    }

    /*
     * Method to submit selected decades.
     * Toast notification if no decades are selected
     * @param View view
     */
    public void submitDecade(View view) {
        //check that at least one decade has been selected
        if (fiveClicked || sixClicked || sevenClicked || eightClicked || nineClicked || twentyClicked || tenClicked) {
            //change class
            startActivity(new Intent(DecadeSelect.this, GameScreen.class));
        } else {
            //give error message
            Toast toast = Toast.makeText(this, "Please select a decade", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
