package com.kaneki.scorecounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button main_b1,main_b2;
    TextView main_tv1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_b1 = (Button) findViewById(R.id.main_b1);
        main_b2 = (Button) findViewById(R.id.main_b2);
        main_tv1 = (TextView) findViewById(R.id.main_tv1);
        main_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Football = new Intent(MainActivity.this, Football.class);
                startActivity(Football);
            }
        });
        main_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Volly = new Intent(MainActivity.this, Vollyball.class);
                startActivity(Volly);
            }
        });
    }
}
