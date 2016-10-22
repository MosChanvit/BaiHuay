package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button Num1 = (Button) findViewById(R.id.button1);
        Button Num2 = (Button) findViewById(R.id.button2);

        Num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,random.class);
                intent.putExtra("c",2);
                startActivity(intent);
            }
        });

        Num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, random.class);
                intent.putExtra("c",3);
                startActivity(intent);
            }
        });
    }
}
