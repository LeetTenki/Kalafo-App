package com.example.kalafo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton button1, d,n,ph,acc,st;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (ImageButton) findViewById(R.id.patient);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PatientLogin.class);
                startActivity(intent);
            }
        });

         d = (ImageButton) findViewById(R.id.doctor);
         n = (ImageButton) findViewById(R.id.nurse);
         ph = (ImageButton) findViewById(R.id.pharmacist);
         acc = (ImageButton)findViewById(R.id.accountant);
         st = (ImageButton) findViewById(R.id.staff);

        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){

                Toast.makeText(getApplicationContext(), "You are a patient, and you cannot view other tabs", Toast.LENGTH_LONG).show();
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){

                Toast.makeText(getApplicationContext(), "You are a patient, and you cannot view other tabs", Toast.LENGTH_LONG).show();
            }
        });

        ph.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){

                Toast.makeText(getApplicationContext(), "You are a patient, and you cannot view other tabs", Toast.LENGTH_LONG).show();
            }
        });

        acc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){

                Toast.makeText(getApplicationContext(), "You are a patient, and you cannot view other tabs", Toast.LENGTH_LONG).show();
            }
        });

        st.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){

                Toast.makeText(getApplicationContext(), "You are a patient, and you cannot view other tabs", Toast.LENGTH_LONG).show();
            }
        });

    }
}