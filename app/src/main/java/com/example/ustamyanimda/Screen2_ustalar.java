package com.example.ustamyanimda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Screen2_ustalar extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<Ustalar> ustalarArrayList;
    private UstaAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2_ustalar);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.actionBar)));


        rv=findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        Ustalar u1=new Ustalar(1,"AHMET USTA OTOMOTİV \n ELEKTRİK:","usta");
        Ustalar u2=new Ustalar(1,"MEHMET USTA OTOMOTİV \n ELEKTRİK:","usta");
        Ustalar u3=new Ustalar(1,"ARİF USTA OTOMOTİV \n ELEKTRİK:","usta");
        Ustalar u4=new Ustalar(1,"HALİL USTA OTOMOTİV \n ELEKTRİK:","usta");
        Ustalar u5=new Ustalar(1,"MURAT USTA OTOMOTİV \n ELEKTRİK:","usta");
        Ustalar u6=new Ustalar(1,"ERALP USTA OTOMOTİV \n ELEKTRİK:","usta");
        Ustalar u7=new Ustalar(1,"MUSTAFA USTA OTOMOTİV \n ELEKTRİK:","usta");
        Ustalar u8=new Ustalar(1,"SEZAİ USTA OTOMOTİV \n ELEKTRİK:","usta");
        Ustalar u9=new Ustalar(1,"ALAADDİN USTA OTOMOTİV \n ELEKTRİK:","usta");
        Ustalar u10=new Ustalar(1,"ALİHAN USTA OTOMOTİV \n ELEKTRİK:","usta");


        ustalarArrayList=new ArrayList<>();

        ustalarArrayList.add(u1);
        ustalarArrayList.add(u2);
        ustalarArrayList.add(u3);
        ustalarArrayList.add(u4);
        ustalarArrayList.add(u5);
        ustalarArrayList.add(u6);
        ustalarArrayList.add(u7);
        ustalarArrayList.add(u8);
        ustalarArrayList.add(u9);
        ustalarArrayList.add(u10);





        adapter=new UstaAdapter(this,ustalarArrayList);

        rv.setAdapter(adapter);




    }
}