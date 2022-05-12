package com.example.ustamyanimda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen4_kayit extends AppCompatActivity {
    private Button btn_gonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4_kayit);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.actionBar)));

        btn_gonder=findViewById(R.id.button_gonder_kayit);
        btn_gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kayitIntent=new Intent(Screen4_kayit.this,Screen5_kayit_finish.class);
                startActivity(kayitIntent);
            }
        });


    }
}