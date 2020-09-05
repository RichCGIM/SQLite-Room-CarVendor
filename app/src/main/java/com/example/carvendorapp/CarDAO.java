package com.example.carvendorapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CarDAO {

    @Insert
    public void insert(Car... cars);

    @Update
    public void update(Car car);

    @Delete
    public void delete(Car car);

    @Query("SELECT * from Car")
    public List<Car> getAll();

    @Query("SELECT * from Car where id = :id")
    public Car getCarById(int id);
}
