package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;

public class GuessVoice extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guess_voice);
    }


    public void back(View v) {
        startActivity(new Intent(GuessVoice.this, MainScreen.class));
    }


    public void guess(View v) {
        startActivity(new Intent(GuessVoice.this, GuessVoiceListener.class));
    }
}
