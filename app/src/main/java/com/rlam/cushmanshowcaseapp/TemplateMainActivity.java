package com.rlam.cushmanshowcaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ViewFlipper;

public class TemplateMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.template_main);

        ViewFlipper viewFlipper;
        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper9);
        viewFlipper.startFlipping();
    }
}
