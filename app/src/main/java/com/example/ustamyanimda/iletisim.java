package com.example.ustamyanimda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iletisim extends AppCompatActivity {

    private Button anaEkranDon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iletisim);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.actionBar)));

        anaEkranDon=findViewById(R.id.button_anaEkranDon);

        anaEkranDon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anaekranadonen=new Intent(iletisim.this,Screen1_menuler.class);
                startActivity(anaekranadonen);
            }
        });


    }
}