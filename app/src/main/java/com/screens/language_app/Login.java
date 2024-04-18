package com.screens.language_app;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;

public class Login extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void login(View v) {
        startActivity(new Intent(Login.this, MainScreen.class));
    }

    public void register(View v) {
        startActivity(new Intent(Login.this, Register.class));
    }

    public void back(View v) {
        startActivity(new Intent(Login.this, SelectLanguage.class));
    }
}
