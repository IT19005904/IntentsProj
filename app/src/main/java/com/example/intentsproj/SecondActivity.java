package com.example.intentsproj;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Action bar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("My Application");

        //Intend to get data
        Intent intent = getIntent();
        String Number1 = (String) intent.getStringExtra("EXTRA_NUMBER1");
        String Number2 = (String) intent.getStringExtra("EXTRA_NUMBER2");

        //Text View
        EditText txtNumber1 = (EditText) findViewById(R.id.textNumber1);
        EditText txtNumber2 = (EditText) findViewById(R.id.txtNumber2);

        //set text to TextView Area
        //txtNumber1.setText(Number1);
        //txtNumber2.setText(Number2);


    }
}