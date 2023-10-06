package com.example.thesilentword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn=findViewById(R.id.btn1);
       btn.setOnClickListener(view -> {
           Intent i = new Intent(MainActivity.this, start.class);
           startActivity(i);
       });
       btn=findViewById(R.id.btn2);
       btn.setOnClickListener(view -> finishAffinity());

    }
}