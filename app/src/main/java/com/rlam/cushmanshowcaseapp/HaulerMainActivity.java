package com.rlam.cushmanshowcaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

public class HaulerMainActivity extends AppCompatActivity {

    public ImageButton b1;
    public ImageButton b2;
    public ImageButton b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hauler_main);



        b1 = (ImageButton)findViewById(R.id.utilityButton);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(HaulerMainActivity.this, Hauler800.class);
                startActivity(a);
            }
        });


    }
}
