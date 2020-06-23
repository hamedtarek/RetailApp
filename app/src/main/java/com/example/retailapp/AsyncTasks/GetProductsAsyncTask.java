package com.example.retailapp.AsyncTasks;

import android.os.AsyncTask;
import android.text.PrecomputedText;

import androidx.core.text.PrecomputedTextCompat;

import com.example.retailapp.Models.ProductModel;
import com.example.retailapp.Room.ProductDAO;

import java.util.List;

public  class GetProductsAsyncTask extends AsyncTask<Void,Void,List<ProductModel>> {

    private ProductDAO productDAO;

    public GetProductsAsyncTask(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    protected List<ProductModel> doInBackground(Void... voids) {
        return productDAO.getAllProducts();
    }

}
