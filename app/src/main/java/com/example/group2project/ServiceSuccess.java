package com.example.group2project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ServiceSuccess extends AppCompatActivity {
    Button returnn;
    TextView name,address, location,contact,rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_success);

        returnn = findViewById(R.id.returnn);
        name = findViewById(R.id.nameget);
        address = findViewById(R.id.addressget);
        location = findViewById(R.id.locationget);
        contact = findViewById(R.id.contactget);
        rate = findViewById(R.id.rateget);

        String namemo= getIntent().getStringExtra("name");
        String addressmo = getIntent().getStringExtra("address");
        String locationmo = getIntent().getStringExtra("location");
        String contactmo = getIntent().getStringExtra("contactnumber");
        String ratemo = getIntent().getStringExtra("rate");

        name.setText(namemo);
        address.setText(addressmo);
        location.setText(locationmo);
        contact.setText(contactmo);
        rate.setText(ratemo);

        returnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Services.class);
                startActivity(intent);
            }
        });


    }
}