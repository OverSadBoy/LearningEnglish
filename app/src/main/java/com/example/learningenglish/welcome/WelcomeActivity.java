package com.example.learningenglish.welcome;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.preference.PreferenceManager;

import com.example.learningenglish.mainMenu.MainActivity;
import com.example.learningenglish.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String token = getToken();
        if (token != null) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
        setContentView(R.layout.activity_welcome);
        PagerAdapter pagerAdapter = new PagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(pagerAdapter);
    }

    private String getToken() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getString("auth_token", null);
    }


}