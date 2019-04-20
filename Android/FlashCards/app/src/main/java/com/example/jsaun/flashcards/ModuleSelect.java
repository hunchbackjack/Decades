package com.example.jsaun.flashcards;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModuleSelect extends AppCompatActivity {

    private Button CO510Button;
    private Button CO518Button;
    private Button CO519Button;
    private Button CO528Button;
    private Button CO532Button;
    private Button CO539Button;
    private Button CO545Button;
    public static int levelSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_module_select);

        CO510Button = findViewById(R.id.co510Button);
        CO518Button = findViewById(R.id.co518Button);
        CO519Button = findViewById(R.id.co519Button);
        CO528Button = findViewById(R.id.co528Button);
        CO532Button = findViewById(R.id.co532Button);
        CO539Button = findViewById(R.id.co539Button);
        CO545Button = findViewById(R.id.co545Button);

        //reset the level selection variable
        levelSelect = 0;

        configureButtons();
    }

    /*
     * Method to make buttons point to individual level screens
     */
    private void configureButtons() {
        //co510 button
        configureButton(CO510Button, CO510.class);
        configureButton(CO518Button, CO518.class);
        configureButton(CO519Button, CO519.class);
//        configureButton(CO528Button, CO528.class);
//        configureButton(CO532Button, CO532.class);
//        configureButton(CO539Button, CO539.class);
//        configureButton(CO545Button, CO545.class);
    }

    /*
     * Method to change the buttons background colour, and then reset it after 50ms
     * @param Button button
     */
    private void changeBackgroundColor(Button button) {
        final Button but = button;
        //change button colour when clicked
        but.setBackgroundColor(ContextCompat.getColor(ModuleSelect.this, R.color.colorPrimaryDark));
        //reset button background colour after 50ms
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                but.setBackgroundColor(ContextCompat.getColor(ModuleSelect.this, R.color.colorPrimary));
            }
        }, 50);
    }

    /*
     * Method to configure buttons.
     * Sets on click listener, changes button colour, and points to specific level select.
     * @param Button button, Class destination
     */
    private void configureButton(Button button, Class destination) {
        //set final to be accessed from inner method
        final Class dest = destination;
        final Button but = button;
        //set on click listener for button
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change button background colour
                changeBackgroundColor(but);
                //point button to specific level select
                startActivity(new Intent(ModuleSelect.this, dest));
            }
        });
    }
}
