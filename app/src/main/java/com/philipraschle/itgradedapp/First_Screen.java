package com.philipraschle.itgradedapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class First_Screen extends AppCompatActivity {
    private EditText enteryourName;
    private ImageButton button;
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__screen);

        button = findViewById(R.id.button);
        button.setEnabled(false);
        enteryourName = findViewById(R.id.enteryourName);
        enteryourName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            String usernameInput =enteryourName .getText().toString().trim();

            button.setEnabled(!usernameInput.isEmpty());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        ImageButton buttonOpenWebView = findViewById(R.id.button);
        buttonOpenWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwebView("https://fortnitetracker.com");
            }
        });

        Button News = findViewById(R.id.News);
        News.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwebView("https://www.epicgames.com/fortnite/de/news");
            }
        });
    }
    public void openwebView(String url){
        Intent intent = new Intent(this, webView.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }
}
