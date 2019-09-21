package com.example.sampleapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //    Copy this code in the MainActivity.java file
//    Located in app->java->com.example.myapplication (or com.example.project_name)->MainActivity
    private int clicks = 0;
    private TextView textView;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        Button toggle = findViewById(R.id.toggle_btn);

        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicks++;

                if(clicks%2 ==1)
                    textView.setVisibility(View.GONE);
                else
                    textView.setVisibility(View.VISIBLE);
                if(clicks == 1){
                    Toast.makeText(MainActivity.this, clicks + " clicks", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(MainActivity.this, clicks + " clicks", Toast.LENGTH_SHORT).show();

            }
        });

    }
}