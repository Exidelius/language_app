package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;

public class RegisterPassword extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_password);
    }

    public void login(View v) {
        startActivity(new Intent(RegisterPassword.this, Login.class));
    }

    public void register(View v) {
        startActivity(new Intent(RegisterPassword.this, Login.class));
    }

    public void back(View v) {
        startActivity(new Intent(RegisterPassword.this, Register.class));
    }
}
