package com.rlam.cushmanshowcaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class CommercialMainActivity extends AppCompatActivity {

    public ImageButton b1;
    public ImageButton b2;
    public ImageButton b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commercial_main);

        b1 = (ImageButton)findViewById(R.id.personnelButton);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(CommercialMainActivity.this, PersonnelTransportMainActivity.class);
                startActivity(a);
            }
        });

        b2 = (ImageButton)findViewById(R.id.utilityButton);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(CommercialMainActivity.this, UtilityMainActivity.class);
                startActivity(a);
            }
        });

    }
}
