package com.example.exampleexam;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.logging.Logger;

public class LoginPage extends AppCompatActivity {

    EditText username,password;
    Button btnLogin;

    public final static String username_key = "com.example.ExampleExam.username_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("User") && password.getText().toString().equals("1234")) {
                    Intent login = new Intent(LoginPage.this, MainActivity.class);
                    String user = username.getText().toString();
                    login.putExtra(username_key,user);
                    startActivity(login);
                } else {
                    showAlert();
                }
            }
        });
    }

    public void showAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Error Login");
        builder.setMessage("Wrong Password and Username ,Please Try Again ");
        builder.setPositiveButton("OK",null);
        AlertDialog alert = builder.create();
        alert.show();
    }
}