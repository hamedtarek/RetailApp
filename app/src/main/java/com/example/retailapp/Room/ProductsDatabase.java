package com.example.retailapp.Room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.retailapp.Models.ProductModel;

@Database(entities = {ProductModel.class} , version = 2 , exportSchema = false)
public abstract class ProductsDatabase extends RoomDatabase {
//         ger
    public abstract ProductDAO gerProductDao();

}
