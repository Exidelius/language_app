package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;

import com.example.mobileapp.R;

public class Profile extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }

    public void switch_theme(View v) {
        startActivity(new Intent(Profile.this, Profile.class));
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
