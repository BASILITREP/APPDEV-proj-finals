package com.example.group2project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.google.android.material.button.MaterialButton;

public class LobbyMain extends AppCompatActivity {
    private Button services;

    Button Bcancel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby_main);


        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        Button buttonLogin = (Button) findViewById(R.id.buttonLogin);
        Bcancel = findViewById(R.id.buttonCancel);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("itrep") && password.getText().toString().equals("itrep")){

                    Toast.makeText(LobbyMain.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Services.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(LobbyMain.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                }
            }

        });

        Bcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

}