package com.screens.language_app;

import android.graphics.Color;
import android.os.Bundle;
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
}
