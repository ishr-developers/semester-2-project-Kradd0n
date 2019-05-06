package com.philipraschle.itgradedapp;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.philipraschle.itgradedapp.ChallengeResponse.Response;

public class NewsActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String> {

    //TODO: This Activity should get the search url from the intent, launch the search, and populate the views from the data.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        getData();
    }


    private void getData() {
        LoaderManager manager = getLoaderManager();
        manager.initLoader(1, null, this);
    }

    @NonNull
    @Override
    public Loader<String> onCreateLoader(int i, @Nullable Bundle bundle) {
        String url = "https://api.fortnitetracker.com/v1/challenges";
        return new DataDownloader(this, url);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<String> loader, String data) {
        String jsonResponse = data;
        String tempData = data;

        setupRecyclerView(data);


    }

    @Override
    public void onLoaderReset(@NonNull Loader<String> loader) {

    }

    public void setupRecyclerView(String data){
        Gson gson = new Gson();
        Response responseObject = gson.fromJson(data, Response.class);
    }

}

