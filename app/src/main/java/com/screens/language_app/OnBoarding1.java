package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;

public class OnBoarding1 extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_2);
    }


    public void next(View v) {
        startActivity(new Intent(OnBoarding1.this, OnBoarding2.class));
    }

    public void skip(View v) {
        startActivity(new Intent(OnBoarding1.this, SelectLanguage.class));
    }
}
