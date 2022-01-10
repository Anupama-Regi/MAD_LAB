package com.example.exercise_05;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Toast;

import android.widget.Button;

import android.view.View;


public class MainActivity extends AppCompatActivity {

    
	@Override

    	protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button clickButton=findViewById(R.id.button1);

        clickButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "YOU CLICKED THE BUTTON ! ! !", Toast.LENGTH_SHORT).show();

            }

        });

    }
}