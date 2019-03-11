package com.edu.kiet.vote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button dhoni;
    Button virat;
    TextView dhonivote;
    TextView viratvote;
    TextView dhoniscore;
    TextView viratscore;
    String dhonicount;
    int countd;
    String viratcount;
    int countv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dhoni = findViewById(R.id.dhonibtn);
        virat = findViewById(R.id.viratbtn);
        dhonivote = findViewById(R.id.dhonivote);
        viratvote = findViewById(R.id.viratvote);
        dhoniscore = findViewById(R.id.dhoniscore);
        viratscore = findViewById(R.id.viratscore);


        dhoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dhonicount = dhonivote.getText().toString();
                countd = Integer.parseInt(dhonicount);
                countd++;
                dhonivote.setText(String.valueOf(countd));
                Toast toast = Toast.makeText(getApplicationContext(), "voted to Dhoni", Toast.LENGTH_SHORT);
                toast.show();
                if(countd==countv) {
                    dhoniscore.setText("DRAW");
                    viratscore.setText("DRAW");
                }


                else if (countd > countv) {
                    dhoniscore.setText("LEADING");
                    viratscore.setText("LACKING");

                }
                else{

                    viratscore.setText("LEADING");
                    dhoniscore.setText("LACKING");
                }



            }


        });

        virat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                viratcount = viratvote.getText().toString();
                countv = Integer.parseInt(viratcount);
                countv++;
                viratvote.setText(String.valueOf(countv));
                Toast toast = Toast.makeText(getApplicationContext(), "voted to Virat", Toast.LENGTH_SHORT);
                toast.show();
                if(countd==countv) {
                    dhoniscore.setText("DRAW");
                    viratscore.setText("DRAW");
                }


                else if (countd > countv) {
                    dhoniscore.setText("LEADING");
                    viratscore.setText("LACKING");

                }
                else{

                    viratscore.setText("LEADING");
                    dhoniscore.setText("LACKING");
                }

            }


            });
        };



    }

