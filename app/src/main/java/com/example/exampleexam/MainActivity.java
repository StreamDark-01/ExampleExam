package com.example.exampleexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvUsername;

    public final static String username_key = "com.example.ExampleExam.username_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String user = intent.getStringExtra(username_key);
        tvUsername = findViewById(R.id.etUsername);
        tvUsername.setText(user);



    }
}