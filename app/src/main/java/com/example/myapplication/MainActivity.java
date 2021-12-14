package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<DesignJava> itemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemsList = new ArrayList<>();
        itemsList.add(new DesignJava("Title 1", "Description 1", R.drawable.ic_android));
        itemsList.add(new DesignJava("Title 2", "Description 2", R.drawable.ic_alarm));
        itemsList.add(new DesignJava("Title 3", "Description 3", R.drawable.ic_account_circle));

        ItemsAdapter adapter;
        adapter = new ItemsAdapter(itemsList);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}