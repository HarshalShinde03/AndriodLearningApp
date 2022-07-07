package com.example.andriodlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inputs_click extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputs_click);
    }

    public void input_src(View v){
        Intent i = new Intent(this,Inputs_webview.class);

        startActivity(i);
    }


}