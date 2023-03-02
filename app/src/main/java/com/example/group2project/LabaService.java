package com.example.group2project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;

public class LabaService extends AppCompatActivity {
    Button submit, backs;
    private EditText name,address, location, contactnumber, rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linis_service);
        backs = findViewById(R.id.back);
        name = findViewById(R.id.username);
        address = findViewById(R.id.address);
        location = findViewById(R.id.location);
        contactnumber = findViewById(R.id.Contactnumber);
        submit = findViewById(R.id.submit);
        rate = findViewById(R.id.hourrate);

        backs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Services.class);
                startActivity(intent);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namecustomer = name.getText().toString();
                String addresss = address.getText().toString();
                String locationn = location.getText().toString();
                String contactnumbers = contactnumber.getText().toString();
                String ratePrice = rate.getText().toString();

                Intent intent = new Intent(getApplicationContext(), ServiceSuccess.class);
                intent.putExtra("name", namecustomer);
                intent.putExtra("address", addresss);
                intent.putExtra("location", locationn);
                intent.putExtra("contactnumber", contactnumbers);
                intent.putExtra("rate", ratePrice);
                startActivity(intent);
            }
        });
    }
}