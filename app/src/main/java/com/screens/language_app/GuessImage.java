package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;

import java.util.Random;

public class GuessImage extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guess_image);
    }

    public void guess(View v) {
        Random random = new Random();
        if (random.nextBoolean()) {
            startActivity(new Intent(GuessImage.this, GuessImageIncorrect.class));
        }
        else {
            startActivity(new Intent(GuessImage.this, GuessImageCorrect.class));
        }
    }

    public void back(View v) {
        startActivity(new Intent(GuessImage.this, MainScreen.class));
    }
}
