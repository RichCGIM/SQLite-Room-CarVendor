package com.example.carvendorapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Car.class}, version=1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CarDAO getCarDAO();
}
