package com.example.ustamyanimda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen2_ustalar extends AppCompatActivity {
    private Button btn_gecis_map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2_ustalar);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.actionBar)));

        btn_gecis_map=findViewById(R.id.btn_haritada_goster1);
        btn_gecis_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mapIntent=new Intent(Screen2_ustalar.this,Screen3_map.class);
                startActivity(mapIntent);
            }
        });









    }
}