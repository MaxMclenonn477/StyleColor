package com.example.stylecolors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //inside onCreate is where we include any code that helps us set up the screen
        //receive the intent
        Intent intent = getIntent();
        // extract the String
        String nameToShow = intent.getStringExtra("none");

        // get a reference
        TextView textView = findViewById(R.id.none);
        textView.setText(nameToShow);
    }
}