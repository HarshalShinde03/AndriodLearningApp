package com.example.andriodlearning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button textButton = findViewById(R.id.textButton);
        Button buttonButton = findViewById(R.id.buttonButton);
        Button inputsButton = findViewById(R.id.inputsButton);
        Button checkboxButton = findViewById(R.id.checkboxButton);
        Button dateButton = findViewById(R.id.datepickerButton);
        Button radioButton = findViewById(R.id.radioButton);
        Button switchButton = findViewById(R.id.switchButton);
        Button modelButton = findViewById(R.id.modalButton);
        Button spinnerButton = findViewById(R.id.spinnerButton);
        Button timepickerButton = findViewById(R.id.timepickerButton);
        textButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Text_click.class);
                startActivity(i);
            }
        });
        buttonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Button_click.class);
                startActivity(i1);
            }
        });
        inputsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(), Inputs_click.class);
                startActivity(i2);
            }
        });
        checkboxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getApplicationContext(), Chechbox_click.class);
                startActivity(i3);
            }
        });
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(Third.this,"Toast",Toast.LENGTH_LONG).show();
                Intent i4 = new Intent(getApplicationContext(), Radio_click.class);
                startActivity(i4);
            }
        });
        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getApplicationContext(), Switch_click.class);
                startActivity(i4);
            }
        });
        modelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getApplicationContext(), Alert_click.class);
                startActivity(i5);
            }
        });
        spinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getApplicationContext(), Spinner_click.class);
                startActivity(i6);
            }
        });
        timepickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(getApplicationContext(), Timepicker_click.class);
                startActivity(i7);
            }
        });
        dateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 = new Intent(getApplicationContext(), Datapicker_click.class);
                startActivity(i8);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about_option:
                Intent i = new Intent(Third.this, About_webview.class);
                startActivity(i);
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }
}