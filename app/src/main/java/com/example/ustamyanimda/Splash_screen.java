package com.example.ustamyanimda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splash_screen extends AppCompatActivity {

    private Button button_atla; //button tanımlıyorum.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.actionBar)));
        //yukarıdaki kod ile actionbar'ın rengini değiştiriyorum.

        Thread timerThread = new Thread(){ //timer kullanarak ekranın 5 saniye sonra diğer ekrana geçmesini söyliyorum
            public void run(){
                try{
                    sleep(3000);//3sn olduğunu belirtiyorum
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(Splash_screen.this, Screen1_menuler.class);//ekran1'e geçmesini söylüyorum
                    startActivity(intent);
                }

                finish();
            }
        };
        timerThread.start();

    }


}