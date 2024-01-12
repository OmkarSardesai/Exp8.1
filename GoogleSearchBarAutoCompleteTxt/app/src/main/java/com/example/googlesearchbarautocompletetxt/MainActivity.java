package com.example.googlesearchbarautocompletetxt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String [] str = {"Hello","Dog","Cat","Who","What is ","how it work ","how to make","is it ","Where is ","Ok google"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,str);
        AutoCompleteTextView act = (AutoCompleteTextView) findViewById(R.id.autoTxtCompleteView);
        act.setAdapter(adapter);
        act.setThreshold(2);
        act.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You have Search :"+parent.getSelectedItem(), Toast.LENGTH_SHORT).show();

            }
        });


    }
}