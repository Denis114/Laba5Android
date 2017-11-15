package com.example.denis.laba5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Vivod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<BD> baza = (List<BD>) getIntent().getSerializableExtra("mtl");
        setContentView(R.layout.vivod);
        ListView list = (ListView) findViewById(android.R.id.list);
        ArrayAdapter<BD> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, baza);
        list.setAdapter(adapter);
    }
}