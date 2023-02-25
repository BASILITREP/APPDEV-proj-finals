package com.example.group2project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private Button buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = (Button) findViewById(R.id.buttonLoginMain);
        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLobbyMain();
            }
        });
    }
    public void openLobbyMain (){
        Intent intent = new Intent(this, LobbyMain.class);
        startActivity(intent);
    }
}