package com.example.ustamyanimda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen1_menuler extends AppCompatActivity {
    private Button btn_ustaları_goster_go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1_menuler);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.actionBar)));

        btn_ustaları_goster_go = findViewById(R.id.btn_ustaları_göster);

        btn_ustaları_goster_go.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent yeniIntent=new Intent(Screen1_menuler.this,Screen2_ustalar.class);

                startActivity(yeniIntent);

            }
        });


    }

}