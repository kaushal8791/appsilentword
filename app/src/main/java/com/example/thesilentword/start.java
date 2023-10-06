package com.example.thesilentword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start extends AppCompatActivity {
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startscreen);
        btn=findViewById(R.id.btn3);
        btn.setOnClickListener(this::onClick);
        btn=findViewById(R.id.btn4);
        btn.setOnClickListener(view -> {
            Intent i = new Intent(start.this,hates.class);
            startActivity(i);
        });
        btn=findViewById(R.id.btn5);
        btn.setOnClickListener(view -> {
            Intent i = new Intent(start.this,attitudes.class);
            startActivity(i);
        });
        btn=findViewById(R.id.btn6);
        btn.setOnClickListener(view -> finishAffinity());
    }

    private void onClick(View view) {
        Intent i = new Intent(start.this, loves.class);
        startActivity(i);
    }
}