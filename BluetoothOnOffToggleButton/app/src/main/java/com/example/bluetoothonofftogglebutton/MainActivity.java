package com.example.bluetoothonofftogglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton tg =(ToggleButton) findViewById(R.id.TogBtn);
        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),(tg.isChecked())?"Bluetooth  is Started":"Bluetooth is Stop",Toast.LENGTH_SHORT).show();
            }
        });
    }
}