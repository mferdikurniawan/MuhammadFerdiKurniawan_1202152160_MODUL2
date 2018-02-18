package com.example.ferdi.ferdi_1202152160_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Samgyetang");
            foods.add("Tteokbokki");
            foods.add("Bibimbap");
            foods.add("Bingsu");
            foods.add("Doenjang");
            foods.add("Gimbap");
            foods.add("Ramyun");
            foods.add("Teluwa");
            foods.add("Yaksik");

            // mamanggil harga
            priceses.add(25000);
            priceses.add(25000);
            priceses.add(35000);
            priceses.add(28000);
            priceses.add(24000);
            priceses.add(26000);
            priceses.add(26000);
            priceses.add(25000);
            priceses.add(28000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.samgyetang);
            photos.add(R.drawable.tteokbokki);
            photos.add(R.drawable.bibimbap);
            photos.add(R.drawable.bingsu);
            photos.add(R.drawable.doenjang);
            photos.add(R.drawable.gimbap);
            photos.add(R.drawable.ramyun);
            photos.add(R.drawable.yaksik);
        }
    }
}
