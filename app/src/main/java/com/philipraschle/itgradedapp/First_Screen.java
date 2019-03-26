package com.philipraschle.itgradedapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
//Testing comment.

public class First_Screen extends AppCompatActivity {
    private EditText enteryourName;
    private ImageButton button;
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__screen);

        //Declare these variables earlier.
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

        //Don't remove this just yet.
        ImageButton buttonOpenWebView = findViewById(R.id.button);
        buttonOpenWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwebView("https://fortnitetracker.com");
            }
        });


        //TODO: Leave this bit alone.
        Button News = findViewById(R.id.News);
        News.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwebView("https://www.epicgames.com/fortnite/de/news"); //TODO: Delete this line.
                //TODO: Generate the proper url when user clicks on the news button.
                //The stub of a function is declared for you.

                //TODO: Declare an intent and pass the url to it.

                //TODO: Launch the new Activity with the intent.
            }
        });
    }


    public void openwebView(String url){
        Intent intent = new Intent(this, webView.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }


    public String generateSearchUrl() {
        //TODO: Use the URI Builder class and the data from the spinner and EditText to generate a Uri.

        return null;
    }
}
