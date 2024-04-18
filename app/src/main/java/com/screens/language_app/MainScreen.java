package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.MainActivity;
import com.example.mobileapp.R;

public class MainScreen extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
    }

    public void profile(View v) {
        startActivity(new Intent(MainScreen.this, Profile.class));
    }

    public void guess_animal(View v) {
        startActivity(new Intent(MainScreen.this, GuessImage.class));
    }

    public void word_practice(View v) {
        startActivity(new Intent(MainScreen.this, GuessTranslation.class));
    }

    public void audition(View v) {
        startActivity(new Intent(MainScreen.this, GuessVoice.class));
    }

    public void game(View v) {
        startActivity(new Intent(MainScreen.this, GuessTranslation.class));
    }
}
