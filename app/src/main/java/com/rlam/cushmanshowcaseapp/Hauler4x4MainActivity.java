package com.rlam.cushmanshowcaseapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

public class Hauler4x4MainActivity extends AppCompatActivity {

    public ImageButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hauler4x4_main);

        ViewFlipper viewFlipper;
        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper5);
        viewFlipper.startFlipping();
    }
}
