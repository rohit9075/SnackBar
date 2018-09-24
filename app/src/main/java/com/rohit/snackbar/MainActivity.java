package com.rohit.snackbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Relative layout reference variable
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // object instantiation
        relativeLayout = findViewById(R.id.parentLayout);
    }

    // Button onclick method call
    public void snackBar(View view) {


        /*
         * Make a Snackbar to display a message

         * @param view     The view to find a parent from.
         * @param text     The text to show.  Can be formatted text.
         * @param duration How long to display the message. Either length Short or length long
         */

        Snackbar.make(relativeLayout, "This is main activity", Snackbar.LENGTH_LONG)
                .setAction("CLOSE", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Hi", Toast.LENGTH_SHORT).show();
                    }

                })
                .show();

    }

}
