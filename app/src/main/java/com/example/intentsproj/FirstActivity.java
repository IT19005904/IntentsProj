package com.example.intentsproj;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private EditText Number1, Number2;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //Action bar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("My Application");

        //Edit Text
        Number1 = (EditText) findViewById(R.id.txtNumber1);
        Number2 = (EditText) findViewById(R.id.txtNumber2);

        //Button
        submit = (Button) findViewById(R.id.btnOK);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get data from the edit text
                String KeyNumber1 = (String) Number1.getText().toString();
                String KeyNumber2 = (String) Number2.getText().toString();

                //Display Message Function
                onDisplay();

                //activity intent
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("EXTRA_NUMBER1", KeyNumber1);
                intent.putExtra("EXTRA_NUMBER2", KeyNumber2);
                startActivity(intent);

            }

        });
    }

    private void onDisplay() {
        Toast toast;
        toast = Toast.makeText(FirstActivity.this, "Sending Message....", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.LEFT,0,0);
        toast.show();

    }


}