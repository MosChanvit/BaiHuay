package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class random extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);



        TextView text = (TextView) findViewById(R.id.text);
        TextView number = (TextView) findViewById(R.id.number);

        Intent M=getIntent();
        int c=M.getIntExtra("c",0);

        Huay mos =new Huay();
        if(c==2) {
            text.setText("เลขท้าย 2 ตัว");
            number.setText(mos.getRandomTwoDigits());
        }
        else if(c==3) {
            text.setText("เลขท้าย 3 ตัว");
            number.setText(mos.getRandomThreeDigits());
        }


    }
}
