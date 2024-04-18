package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;


public class OnBoarding extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_1);
    }

    public void next(View v) {
        startActivity(new Intent(OnBoarding.this, OnBoarding1.class));
    }

    public void skip(View v) {
        startActivity(new Intent(OnBoarding.this, SelectLanguage.class));
    }
}