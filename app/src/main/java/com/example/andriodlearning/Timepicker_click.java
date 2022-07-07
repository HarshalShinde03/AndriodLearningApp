package com.example.andriodlearning;

//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class Timepicker_click extends AppCompatActivity {

    TextView textview1;
    TimePicker timepicker;
    Button changetime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepicker_click);

        textview1=(TextView)findViewById(R.id.textView1);
        timepicker=(TimePicker)findViewById(R.id.timePicker);
        //Uncomment the below line of code for 24 hour view
        timepicker.setIs24HourView(true);
        changetime=(Button)findViewById(R.id.button1);

        textview1.setText(getCurrentTime());

        changetime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textview1.setText(getCurrentTime());
            }
        });

    }

    public String getCurrentTime(){
        String currentTime="Current Time: "+timepicker.getCurrentHour()+":"+timepicker.getCurrentMinute();
        return currentTime;
    }
    public void timepicker_src(View v){
        Intent i = new Intent(this,Timepicker_webview.class);
        startActivity(i);
    }

}