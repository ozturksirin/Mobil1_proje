package com.example.ustamyanimda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;

public class Screen5_kayit_finish extends AppCompatActivity {

    private Button anaEkranGo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5_kayit_finish);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.actionBar)));

        anaEkranGo=findViewById(R.id.button_anaEkranReturn);

        anaEkranGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent donus=new Intent(Screen5_kayit_finish.this,Screen1_menuler.class);
                startActivity(donus);
            }
        });

    }
}