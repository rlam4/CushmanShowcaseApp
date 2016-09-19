package com.rlam.cushmanshowcaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

public class Hauler800 extends AppCompatActivity {

    public Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hauler800);

        ViewFlipper viewFlipper;
        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);
        viewFlipper.startFlipping();

        b1 = (Button)findViewById(R.id.button10);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Hauler800.this, VideoTestActivity.class);
                startActivity(a);
            }
        });
    }

}
