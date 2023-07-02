package com.example.kalafo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Calendar;

public class PatientForm extends AppCompatActivity {
    Button button1;
    EditText editTextDate;
    EditText edit_date_view;
    EditText village , id;
    CheckBox male, female;
    DatePickerDialog.OnDateSetListener onDateSetListener;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_form);

        edit_date_view = findViewById(R.id.edit_date_view);
        village = findViewById(R.id.village);
        id = findViewById(R.id.id);
        male = findViewById(R.id.m);
        female = findViewById(R.id.f);


        button1=(Button)findViewById(R.id.cancel);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PatientForm.this,MainActivity.class);
                startActivity(intent);
            }
        });




        editTextDate = findViewById(R.id.edit_date_view);
        editTextDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(PatientForm.this,onDateSetListener, year, month, day);
                datePickerDialog.show();
            }
        });
        onDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                String date = dayOfMonth + "/" + month + "/" + year;
                editTextDate.setText(date);
            }
        };



    }
    public void send(View view){
        String input = "DOB: " + edit_date_view.getEditableText().toString();
        input += " \n";
        input += "Gender: " + male.getText().toString();
        input += " \n";
        input += "Place of Birth: " + village.getEditableText().toString();
        input += " \n";
        input += "ID: " + id.getEditableText().toString();

        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.home) {
            Intent intent = new Intent(PatientForm.this,PatientForm.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.about) {
            Intent intent = new Intent(PatientForm.this,About.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.contact) {
            Intent intent = new Intent(PatientForm.this,Contact.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}