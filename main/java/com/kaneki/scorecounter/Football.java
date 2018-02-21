package com.kaneki.scorecounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Football extends AppCompatActivity {
    Button fb_b1, fb_b2, fb_b3;
    int team_a, team_b;
    TextView fb_tv1, fb_tv2, fb_tv3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.football);
        team_a = 0;
        team_b = 0;
        fb_tv1 = (TextView) findViewById(R.id.fb_tv1);
        fb_tv2 = (TextView) findViewById(R.id.fb_tv2);
        fb_tv3 = (TextView) findViewById(R.id.fb_tv3);
        fb_b1 = (Button) findViewById(R.id.fb_b1);
        fb_b2 = (Button) findViewById(R.id.fb_b2);
        fb_b3 = (Button) findViewById(R.id.fb_b3);
        fb_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++team_a;
                fb_tv1.setText(""+team_a);
                if (team_a > team_b)
                    fb_tv3.setText("Team A is winning");
                else if (team_b > team_a)
                    fb_tv3.setText("Team B is winning");
                else
                    fb_tv3.setText("Currently a tie");
            }
        });
        fb_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++team_b;
                fb_tv2.setText(""+team_b);
                if (team_a > team_b)
                    fb_tv3.setText("Team A is winning");
                else if (team_b > team_a)
                    fb_tv3.setText("Team B is winning");
                else
                    fb_tv3.setText("Currently a tie");
            }
        });
        fb_b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Main = new Intent(Football.this,MainActivity.class);
                startActivity(Main);
            }
        });
    }
}

