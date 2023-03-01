package com.example.group2project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class WorkerLobby<adapter> extends AppCompatActivity {
    private Button button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_lobby);

        button = (Button) findViewById(R.id.buttonLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openServices();
            }
        });


    }

    public void openServices(){
        Intent intent = new Intent(this, Services.class);
        startActivity(intent);
    }
    //get the spinner from the xml.
    Spinner dropdown = findViewById(R.id.wrkLoc);
    //create a list of items for the spinner.
    String[] items = new String[]{"Cavite", "Laguna", "Metro Manila","Batangas","Rizal"};
    //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.

}