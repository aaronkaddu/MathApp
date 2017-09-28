package com.forwards.mathapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchActitvity extends AppCompatActivity {

    Switch sw;
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_layout);

        sw = (Switch) findViewById(R.id.sw1);
        layout = (RelativeLayout) findViewById(R.id.myLayout);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(SwitchActitvity.this,"Switch is On",Toast.LENGTH_LONG).show();
                    layout.setBackgroundColor(Color.RED);
                }else {
                    Toast.makeText(SwitchActitvity.this,"Switch is Off",Toast.LENGTH_LONG).show();
                    layout.setBackgroundColor(Color.BLUE);
                }
            }
        });
    }
}
