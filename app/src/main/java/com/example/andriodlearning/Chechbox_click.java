package com.example.andriodlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Chechbox_click extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chechbox_click);
    }
//        t1 = findViewById(R.id.textView_checkbox);
//        t1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                gotoUrl("https://mahadbtmahait.gov.in/Login/Login");
//            }
//        });
//
//    }
//    private  void gotoUrl(String s){
//        Uri uri = Uri.parse(s);
//        startActivity(new Intent(Intent.ACTION_VIEW,uri));
//    }

    public void tejas(View v){
        Intent i = new Intent(this,Checkbox_webview.class);

        startActivity(i);
    }
}