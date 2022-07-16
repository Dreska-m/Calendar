package com.sto.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clc_authorization(View view){
        Intent intent = new Intent(this, Authorization.class);
        startActivity(intent);

    }

    public void clc_calendar(View view){
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);

    }
}