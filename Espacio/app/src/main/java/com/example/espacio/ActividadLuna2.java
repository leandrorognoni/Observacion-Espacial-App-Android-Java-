package com.example.espacio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.espacio.controller.LunaController;

public class ActividadLuna2 extends AppCompatActivity {


    public TextView ti1;
    public TextView desc1;
    public TextView ti2;
    public TextView desc2;
    public TextView desc3;
    public LunaController lunaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_luna2);

        ti1 = findViewById(R.id.ti1);
        desc1 = findViewById(R.id.desc1);
        ti2 = findViewById(R.id.ti2);
        desc2 = findViewById(R.id.desc2);
        desc3 = findViewById(R.id.desc3);

        lunaController = new LunaController(this);
        lunaController.aplicarTextSegundaActividadLuna();


    }



    public void volverAtras (View v){

        Intent intento = new Intent(this, ActividadLuna.class);
        startActivity(intento);

    }
    public void volverMenu (View v){

        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);

    }

}