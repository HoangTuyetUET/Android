package com.example.snowhoang.linearlayout1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv=(TextView) findViewById(R.id.tvColor);
        final RadioGroup radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
        final RadioButton radioRed=(RadioButton)findViewById(R.id.radioRed);
        final RadioButton radioBlue=(RadioButton)findViewById(R.id.radioBlue);
        final RadioButton radioWhite=(RadioButton)findViewById(R.id.radioWhite);
        final Button btnSetColor= (Button) findViewById(R.id.btnSetColor);
        final Button btnCancel=(Button) findViewById(R.id.btnCancel);
        // Select Color
        btnSetColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton=(RadioButton) findViewById(selectedId);
                if(radioButton==radioRed){
                    tv.setBackgroundColor(Color.RED);
                }else
                if(radioButton==radioWhite){
                    tv.setBackgroundColor(Color.WHITE);
                }else
                if(radioButton==radioBlue){
                    tv.setBackgroundColor(Color.BLUE);
                }
            }
        });
        //the Clear button makes the TextView black
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setBackgroundColor(Color.BLACK);
            }
        });
    }
}
