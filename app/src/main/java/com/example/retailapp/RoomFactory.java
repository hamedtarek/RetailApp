package com.example.retailapp;

import android.content.Context;

import androidx.room.Room;

import com.example.retailapp.Room.ProductsDatabase;

public class RoomFactory {
    private static ProductsDatabase roomDatabase;

    private RoomFactory(){

    }


    public static ProductsDatabase createOrGetRoomObject(Context context){

        if (roomDatabase == null){

            roomDatabase = Room.databaseBuilder(context,ProductsDatabase.class,"products_database")
                    .build();
        }

        return roomDatabase;
    }
}
