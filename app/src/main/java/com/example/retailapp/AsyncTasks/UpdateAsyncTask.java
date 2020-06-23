package com.example.retailapp.AsyncTasks;

import android.os.AsyncTask;

import com.example.retailapp.Models.ProductModel;
import com.example.retailapp.Room.ProductDAO;

public class UpdateAsyncTask extends AsyncTask<ProductModel , Void , Void> {

    private ProductDAO productDAO;

    public UpdateAsyncTask(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    protected Void doInBackground(ProductModel... productModels) {
        productDAO.updateProduct(productModels[0]);
        return null;
    }
}
