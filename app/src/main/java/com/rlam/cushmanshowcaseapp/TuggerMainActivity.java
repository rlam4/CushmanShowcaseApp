package com.rlam.cushmanshowcaseapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ViewFlipper;

public class TuggerMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tugger_main);

        ViewFlipper viewFlipper;
        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper10);
        viewFlipper.startFlipping();
    }
}
