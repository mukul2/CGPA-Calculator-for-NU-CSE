package com.example.mukul.mycgpa;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainwithMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainwith_menu);
        TextView a1 =(TextView)findViewById(R.id.a1);
        TextView a2 =(TextView)findViewById(R.id.a2);
        TextView a3 =(TextView)findViewById(R.id.a3);
        TextView a4 =(TextView)findViewById(R.id.a4);
        TextView a5 =(TextView)findViewById(R.id.a5);
        TextView a6 =(TextView)findViewById(R.id.a6);
        TextView a7 =(TextView)findViewById(R.id.a7);
        TextView a8 =(TextView)findViewById(R.id.a8);


        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainwithMenu.this,M1st.class);
              startActivity(i);
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainwithMenu.this,M2nd.class);
                startActivity(i);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainwithMenu.this,M3rd.class);
                startActivity(i);
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainwithMenu.this,M4th.class);
                startActivity(i);
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainwithMenu.this,M5th.class);
                startActivity(i);
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainwithMenu.this,MainActivity.class);
                startActivity(i);
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainwithMenu.this,M7th.class);
                startActivity(i);
            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainwithMenu.this,M8th.class);
                startActivity(i);
            }
        });

    }
}
