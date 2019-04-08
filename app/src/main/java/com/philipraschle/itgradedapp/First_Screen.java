package com.philipraschle.itgradedapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

//Testing comment.
//I made a change.
public class First_Screen extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private EditText enteryourName;
    private ImageButton button;
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__screen);

        Spinner platformspinner = findViewById(R.id.platformspinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.platformarray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        platformspinner.setAdapter(adapter);
        platformspinner.setOnItemSelectedListener(this);

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
                //TODO: Generate the proper url when user clicks on the news button.
                //The stub of a function is declared for you.
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("https");
                builder.authority("fortnitetracker.com");

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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent .getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
