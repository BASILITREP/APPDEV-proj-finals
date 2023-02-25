package com.example.group2project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.google.android.material.button.MaterialButton;

public class LobbyMain extends AppCompatActivity {
    private Button services;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby_main);


        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        Button buttonLogin = (Button) findViewById(R.id.buttonLogin);

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
    }

}