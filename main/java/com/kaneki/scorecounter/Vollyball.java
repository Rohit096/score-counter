package com.kaneki.scorecounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Vollyball extends AppCompatActivity {
    Button vb_b1, vb_b2, vb_b3;
    int team_a, team_b;
    TextView vb_tv1, vb_tv2, vb_tv3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vollyball);
        team_a = 0;
        team_b = 0;
        vb_tv1 = (TextView) findViewById(R.id.vb_tv1);
        vb_tv2 = (TextView) findViewById(R.id.vb_tv2);
        vb_tv3 = (TextView) findViewById(R.id.vb_tv3);
        vb_b1 = (Button) findViewById(R.id.vb_b1);
        vb_b2 = (Button) findViewById(R.id.vb_b2);
        vb_b3 = (Button) findViewById(R.id.vb_b3);
        vb_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++team_a;
                vb_tv1.setText(""+team_a);
                if (team_a > team_b)
                    vb_tv3.setText("Team A is winning");
                else if (team_b > team_a)
                    vb_tv3.setText("Team B is winning");
                else
                    vb_tv3.setText("Currently a tie");
            }
        });
        vb_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++team_b;
                vb_tv2.setText(""+team_b);
                if (team_a > team_b)
                    vb_tv3.setText("Team A is winning");
                else if (team_b > team_a)
                    vb_tv3.setText("Team B is winning");
                else
                    vb_tv3.setText("Currently a tie");
            }
        });
        vb_b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Main = new Intent(Vollyball.this,MainActivity.class);
                startActivity(Main);
            }
        });
    }
}

