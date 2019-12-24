package com.example.autocompletettextviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] array = {"Google", "Facebook", "LinkedIn", "Telsa", "Lucid", "Mediation"};
        textView = (AutoCompleteTextView) findViewById(R.id.textView);
        textView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array));
        textView.setThreshold(1);
        textView.setTextColor(Color.RED);
    }
}
