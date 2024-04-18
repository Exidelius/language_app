package com.screens.language_app;

import android.app.UiModeManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.MainActivity;
import com.example.mobileapp.R;

public class Profile extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }

    public void switch_theme(View v) {
        Configuration configuration = getResources().getConfiguration();
        int currentNightMode = configuration.uiMode & Configuration.UI_MODE_NIGHT_MASK;
        switch (currentNightMode) {
            case Configuration.UI_MODE_NIGHT_NO:
                Log.d("Тема", "Светлая тема");
                configuration.uiMode = Configuration.UI_MODE_NIGHT_YES;
                break;
            case Configuration.UI_MODE_NIGHT_YES:
                Log.d("Тема", "Тёмная тема");
                configuration.uiMode = Configuration.UI_MODE_NIGHT_NO;
                break;
        }
        recreate();
    }

    public void change_language(View v) {
        startActivity(new Intent(Profile.this, SelectLanguage.class));
    }

    public void change_image(View v) {
        startActivity(new Intent(Profile.this, ProfileResize.class));
    }

    public void logout(View v) {
        startActivity(new Intent(Profile.this, Login.class));
    }
}
