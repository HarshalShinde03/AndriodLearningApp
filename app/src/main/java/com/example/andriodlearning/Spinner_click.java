package com.example.andriodlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Spinner_click extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_click);
    }

    public void spinner_src(View v){
        Intent i = new Intent(this,Spinner_webview.class);
        startActivity(i);
    }
}