package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerView);

        List<item> items=new ArrayList<item>();
        items.add(new item("John Wick","johnwick@hhh.com", R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));
        items.add(new item("John Wick","johnwick@hhh.com",R.drawable.golden3));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new myAdapter(getApplicationContext(),items));
    }
}