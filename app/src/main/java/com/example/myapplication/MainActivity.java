package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView tvReset,tvAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvReset=findViewById(R.id.tvReset);
        tvAccount=findViewById(R.id.tvAccount);


        tvReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentReset=new Intent(MainActivity.this,Password_Reset.class);
                startActivity(intentReset);
            }
        });

        tvAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentAcc=new Intent(MainActivity.this,Registration.class);
                startActivity(intentAcc);
            }
        });
    }
}