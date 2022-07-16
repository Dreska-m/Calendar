package com.sto.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Authorization extends AppCompatActivity {

    EditText number_phone,car_number;

    private String newNumber_car, newPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);

        Intent intent = getIntent();

        number_phone = (EditText) findViewById(R.id.number_phone);
        car_number = (EditText) findViewById(R.id.car_number);

        String phone = intent.getStringExtra("phone");
        String number_car = intent.getStringExtra("number_car");

        newPhone = phone;
        newNumber_car = number_car;
    }

    public void clc_enter(View v){
        String phone = number_phone.getText().toString();
        String car = car_number.getText().toString();

        if(phone.equals(newPhone) && car.equals(newNumber_car)){
            Intent intent = new Intent(this, Calendar.class);
            startActivity(intent);
            finish();
        }
        else {
            Toast.makeText(this, "ошибка, не верно ведены номер телефонна или машины", Toast.LENGTH_SHORT).show();
        }
    }

    public void clc_registration(View view){
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }

    public void clc_home_2(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void clc_Back_2(View view){
        finish();
    }
}