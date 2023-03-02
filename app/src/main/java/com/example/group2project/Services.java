package com.example.group2project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class Services extends AppCompatActivity {
    ImageButton waliss, laba, luto, grocery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        waliss = findViewById(R.id.walis);
        laba = findViewById(R.id.laba);
        luto = findViewById(R.id.luto);
        grocery = findViewById(R.id.grocery);

        waliss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LinisService.class);
                startActivity(intent);
            }
        });

    }

}