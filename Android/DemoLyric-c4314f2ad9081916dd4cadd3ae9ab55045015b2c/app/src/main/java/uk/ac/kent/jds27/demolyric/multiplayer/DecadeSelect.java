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
     * Method to add a decade to the list
     * @param View view
     */
    public void addDecade(View view) {
        //get text from button
        Button b = (Button)view;
        String decade = b.getText().toString();
        switch (decade) {
            case "50's":
                fiveClicked = changeButtonColour(view, fiveClicked);
                break;
            case "60's":
                sixClicked = changeButtonColour(view, sixClicked);
                break;
            case "70's":
                sevenClicked = changeButtonColour(view, sevenClicked);
                break;
            case "80's":
                eightClicked = changeButtonColour(view, eightClicked);
                break;
            case "90's":
                nineClicked = changeButtonColour(view, nineClicked);
                break;
            case "00's":
                twentyClicked = changeButtonColour(view, twentyClicked);
                break;
            case "10's":
                tenClicked = changeButtonColour(view, tenClicked);
                break;
        }
    }

    /*
     * Method to change a buttons colour
     * @param View view, Boolean button
     */
    private Boolean changeButtonColour(View view, Boolean button) {
        //check if button has been selected
        if (!button) {
            //set boolean to true
            button = true;
            //change to dark primary colour
            view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        } else {
            //set boolean to false
            button = false;
            //change to primary colour
            view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
        }
        return button;
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
