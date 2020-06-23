package com.example.retailapp;

import com.example.retailapp.Models.ProductsResponse;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;

public interface WebServices {


//    @GET("products")
//    Call<ProductsResponse> getProducts();

    @GET("products")
    Single<ProductsResponse> getProducts();

}
