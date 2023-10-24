package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.LauncherApps;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.myapplication.Adapter.PopularAdapter;
import com.example.myapplication.Domain.PopularDomain;
import com.example.myapplication.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterPopular;
private RecyclerView recyclerViewPopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecycleView();
        bottomNavigation();
    }

    private void bottomNavigation() {
        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);

        homeBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,MainActivity.class)));

        cartBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,MainActivity.class)));
    }

    private void initRecycleView() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("T-shirt Black","Immerse yourself in a world of vibrant visuals and\n" +
                "        immersive sound with the VisionX Pro LED TV.\n" +
                "        Its cutting-edge LED technology brings every\n" +
                "        scene to life with striking clarity and rich colors.\n" +
                "        With seamless integration and a sleek, modern\n" +
                "        design, the VisionX Pro is not just a TV, but a\n" +
                "        centerpiece for your entertainment space.\n" +
                "        With its sleek, modern design, the VisionX Pro is\n" +
                "        not just a TV, but a centerpiece for your\n" +
                "        entertainment space. The ultra-slim bezel and\n" +
                "        premium finish blend seamlessly with any decor","item_1",15,4,500));
        items.add(new PopularDomain("Smart Watch","Immerse yourself in a world of vibrant visuals and\n" +
                "        immersive sound with the VisionX Pro LED TV.\n" +
                "        Its cutting-edge LED technology brings every\n" +
                "        scene to life with striking clarity and rich colors.\n" +
                "        With seamless integration and a sleek, modern\n" +
                "        design, the VisionX Pro is not just a TV, but a\n" +
                "        centerpiece for your entertainment space.\n" +
                "        With its sleek, modern design, the VisionX Pro is\n" +
                "        not just a TV, but a centerpiece for your\n" +
                "        entertainment space. The ultra-slim bezel and\n" +
                "        premium finish blend seamlessly with any decor","item_2",10,4.5,450));
        items.add(new PopularDomain("Iphone 14","Immerse yourself in a world of vibrant visuals and\n" +
                "        immersive sound with the VisionX Pro LED TV.\n" +
                "        Its cutting-edge LED technology brings every\n" +
                "        scene to life with striking clarity and rich colors.\n" +
                "        With seamless integration and a sleek, modern\n" +
                "        design, the VisionX Pro is not just a TV, but a\n" +
                "        centerpiece for your entertainment space.\n" +
                "        With its sleek, modern design, the VisionX Pro is\n" +
                "        not just a TV, but a centerpiece for your\n" +
                "        entertainment space. The ultra-slim bezel and\n" +
                "        premium finish blend seamlessly with any decor","item_3",15,4.3,800));
        items.add(new PopularDomain("VisionX Pro LED TV","Immerse yourself in a world of vibrant visuals and\n" +
                "        immersive sound with the VisionX Pro LED TV.\n" +
                "        Its cutting-edge LED technology brings every\n" +
                "        scene to life with striking clarity and rich colors.\n" +
                "        With seamless integration and a sleek, modern\n" +
                "        design, the VisionX Pro is not just a TV, but a\n" +
                "        centerpiece for your entertainment space.\n" +
                "        With its sleek, modern design, the VisionX Pro is\n" +
                "        not just a TV, but a centerpiece for your\n" +
                "        entertainment space. The ultra-slim bezel and\n" +
                "        premium finish blend seamlessly with any decor","item_4",18,4.0,1500));


        recyclerViewPopular = findViewById(R.id.view1);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPopular = new PopularAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);
    }
}
