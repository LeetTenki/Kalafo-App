package com.example.kalafo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.home) {
            Intent intent = new Intent(About.this,PatientForm.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.about) {
            Intent intent = new Intent(About.this,About.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.contact) {
            Intent intent = new Intent(About.this,Contact.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}