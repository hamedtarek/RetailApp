package com.example.retailapp.Room;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.retailapp.Models.ProductModel;

import java.util.List;

@Dao
public interface ProductDAO {


    @Query("SELECT * FROM products")
    List<ProductModel> getAllProducts();

    @Insert
    void insertProduct(ProductModel productModel);

    @Query("DELETE FROM products")
    void deleteAllProducts();

//    @Delete
//    void deletAllProducts(List<ProductModel> productList);

    @Update
    void updateProduct(ProductModel productModel);

}
