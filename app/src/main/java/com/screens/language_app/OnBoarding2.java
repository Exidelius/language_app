package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;

public class OnBoarding2 extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_3);
    }


    public void next(View v) {
        startActivity(new Intent(OnBoarding2.this, SelectLanguage.class));
    }

    public void skip(View v) {
        startActivity(new Intent(OnBoarding2.this, SelectLanguage.class));
    }
}
