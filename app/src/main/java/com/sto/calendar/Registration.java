package com.sto.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Registration extends AppCompatActivity {

    EditText Surname,Name,Middle_name,Number,Car;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Surname = (EditText) findViewById(R.id.Surname);
        Name = (EditText) findViewById(R.id.Name);
        Middle_name = (EditText) findViewById(R.id.Middle_name);
        Number = (EditText) findViewById(R.id.Number);
        Car = (EditText) findViewById(R.id.Car);
    }

    public void clc_rgstrtn(View v){
        String surname = Surname.getText().toString();
        String name = Name.getText().toString();
        String middle_name = Middle_name.getText().toString();
        String number = Number.getText().toString();
        String car = Car.getText().toString();

        if (surname.length() == 0){
            Toast.makeText(this, "Ошибка ведите фамилию", Toast.LENGTH_SHORT).show();
        }
        if (name.length() == 0){
            Toast.makeText(this, "Ошибка ведите имя", Toast.LENGTH_SHORT).show();
        }
        if (middle_name.length() == 0){
            Toast.makeText(this, "Ошибка ведите отчество", Toast.LENGTH_SHORT).show();
        }
        if (number.length() == 0){
            Toast.makeText(this, "Ошибка ведите номер телефона", Toast.LENGTH_SHORT).show();
        }
        if (car.length() == 0){
            Toast.makeText(this, "Ошибка ведите номер машины", Toast.LENGTH_SHORT).show();
        }
        if (surname.length() > 0 && name.length() > 0 && middle_name.length() > 0 && number.length() > 0 && car.length() > 0){
            Intent intent = new Intent(this, Authorization.class);
            intent.putExtra("phone", number);
            intent.putExtra("number_car", car);
            startActivity(intent);
        }

    }

    public void clc_home_1(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void clc_Back_1(View view){
        finish();
    }
}