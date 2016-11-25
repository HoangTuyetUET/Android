package com.example.snowhoang.tablelayout2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnColor1 = (Button) findViewById(R.id.btnColor1);
        final Button btnColor2 = (Button) findViewById(R.id.btnColor2);
        final Button btnColor3 = (Button) findViewById(R.id.btnColor3);
        final Button btnClear = (Button) findViewById(R.id.btnClear);
        final TextView tv = (TextView) findViewById(R.id.tv);
        btnColor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setBackgroundColor(Color.RED);
            }
        });
        btnColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setBackgroundColor(Color.YELLOW);
            }
        });
        btnColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setBackgroundColor(Color.BLUE);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setBackgroundColor(Color.BLACK);
            }
        });
    }
}
