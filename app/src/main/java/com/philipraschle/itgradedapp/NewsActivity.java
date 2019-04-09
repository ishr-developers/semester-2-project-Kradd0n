package com.philipraschle.itgradedapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {

    //TODO: This Activity should get the search url from the intent, launch the search, and populate the views from the data.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }
}
