package com.example.carvendorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase database = Room.databaseBuilder(
                this,
                AppDatabase.class,
                "myDatabase")
                .allowMainThreadQueries()
                .build();

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "335";
        bmw.color = "black";
        bmw.year = 2014;

        Car jeep = new Car();
        jeep.brand = "JEEP";
        jeep.model = "Compass";
        jeep.color = "sand";
        jeep.year = 2010;

        CarDAO carDAO = database.getCarDAO();

        carDAO.insert(bmw, jeep);

        bmw = null;
        jeep = null;

        List<Car> carsFromDatabase = carDAO.getAll();

        TextView listOfCars = findViewById(R.id.main_textView_listOfCars);

        listOfCars.setText(String.valueOf(carsFromDatabase.size()));

    }
}