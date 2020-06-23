package com.example.retailapp.AsyncTasks;

import android.os.AsyncTask;

import com.example.retailapp.Models.ProductModel;
import com.example.retailapp.Room.ProductDAO;

import retrofit2.adapter.rxjava2.Result;

public  class InsertAsyncTask extends AsyncTask<ProductModel, Void, Void> {

    private ProductDAO productDAO;

    public InsertAsyncTask(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    protected Void doInBackground(ProductModel... productModels) {
        productDAO.insertProduct(productModels[0]);
        return null;
    }
}
