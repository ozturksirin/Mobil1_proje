package com.example.ustamyanimda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Screen1_menuler extends AppCompatActivity {
    private Button btn_ustaları_goster_go;
    private Button btn_usta_kayit_go;
    private Spinner spinner_otomotiv;
    private ArrayList<String> bolumler=new ArrayList<>();
    private ArrayAdapter<String> veriAdaptoru;

    private Button btn_iletisim_go;



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

        btn_usta_kayit_go=findViewById(R.id.usta_kayit);
        btn_usta_kayit_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kayit_Intent=new Intent(Screen1_menuler.this,Screen4_kayit.class);
                startActivity(kayit_Intent);
            }
        });

        spinner_otomotiv=findViewById(R.id.spinner_bolumler);

        bolumler.add(">OTOMOTİV");
        bolumler.add(">BOYA");
        bolumler.add(">DÖŞEME");
        bolumler.add(">EKSPERTİZ");
        bolumler.add(">ELEKTRİK");
        bolumler.add(">KAPORTA");
        bolumler.add(">KARAVAN");
        bolumler.add(">KURTARMA/ÇEKİCİ");
        bolumler.add(">LASTİK");
        bolumler.add(">MEKANİK");
        bolumler.add(">MOTOR");
        bolumler.add(">OTO KİRALAMA");
        bolumler.add(">RADYATÖR/KLİMA");
        bolumler.add(">SERVİS");
        bolumler.add(">TEMİZLİK");

        veriAdaptoru=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,bolumler);


        spinner_otomotiv.setAdapter(veriAdaptoru);

        spinner_otomotiv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Seçilen Ustalar : "+bolumler.get(i),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btn_iletisim_go = findViewById(R.id.btn_iletisim);

        btn_iletisim_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent iletisim=new Intent(Screen1_menuler.this, com.example.ustamyanimda.iletisim.class) ;

                startActivity(iletisim);
            }
        });




    }

}