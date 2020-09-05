package com.example.carvendorapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Car {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String brand;
    public String model;
    public String color;
    public int year;
}
