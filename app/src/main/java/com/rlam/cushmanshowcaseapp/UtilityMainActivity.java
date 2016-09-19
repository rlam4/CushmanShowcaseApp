package com.rlam.cushmanshowcaseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UtilityMainActivity extends AppCompatActivity {

    public ImageButton b1;
    public ImageButton b2;
    public ImageButton b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.utility_main);

        b1 = (ImageButton)findViewById(R.id.haulerButton);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(UtilityMainActivity.this, HaulerMainActivity.class);
                startActivity(a);
            }
        });

        b2 = (ImageButton)findViewById(R.id.hauler4Button);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(UtilityMainActivity.this, Hauler4x4MainActivity.class);
                startActivity(a);
            }
        });

        b2 = (ImageButton)findViewById(R.id.haulerXButton);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(UtilityMainActivity.this, HaulerXMainActivity.class);
                startActivity(a);
            }
        });
    }


}
