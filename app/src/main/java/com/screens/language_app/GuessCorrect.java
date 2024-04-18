package com.screens.language_app;

import android.os.Bundle;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;

public class GuessCorrect extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getWindow().setStatusBarColor(getResources().getColor(R.color.usable_green));
    }
}
