package com.example.andriodlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Text_click extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_click);
        TextView tv = (TextView)findViewById(R.id.textView2);
        tv.setText("Welcome to Andriod Learning");
    }

    public void text_src(View v){
        Intent i = new Intent(this,Text_webview.class);
        startActivity(i);
    }
}