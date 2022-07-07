package com.example.andriodlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Radio_click extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_click);
    }

    public void radio_src(View v){
        Intent i = new Intent(this,Radio_webview.class);
        startActivity(i);
    }
}