package com.example.espacio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {



    ImageView fondo;

    String urlFondo = "https://media4.giphy.com/media/MXQnyEQwBJ6eTj90L5/giphy.gif?cid=790b761195" +
            "6338994ebc319e038ecbdfefa580a2c753ec5d&rid=giphy.gif&ct=g";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fondo = findViewById(R.id.fondo);

        Glide.with(getApplicationContext())
                .load( urlFondo)
                .into(fondo);


    }


        public void luna (View v){

            Intent intento = new Intent(this, ActividadLuna.class);
            startActivity(intento);

        }

        public void sol (View v){

        Intent intento = new Intent(this, ActividadSol.class);
        startActivity(intento);

    }


}