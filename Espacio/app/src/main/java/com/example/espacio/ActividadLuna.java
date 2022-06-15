package com.example.espacio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.espacio.controller.LunaController;

public class ActividadLuna extends AppCompatActivity {

    public TextView t1luna;
    public TextView t1luna2;
    public TextView t1luna3;
    public TextView t2luna;
    public TextView desc;
    public TextView descTitu;
    public TextView adi;
    public  ImageView iwluna;
    public ImageView fondoLuna;
    public ProgressBar pbar1;

    private LunaController lunaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_luna);

        t1luna = findViewById(R.id.t1luna);
        t1luna2 = findViewById(R.id.t1luna2);
        t1luna3 = findViewById(R.id.t1luna3);
        t2luna = findViewById(R.id.t2luna);
        iwluna = findViewById(R.id.iwluna);
        desc = findViewById(R.id.desc);
        descTitu = findViewById(R.id.descTitu);
        adi = findViewById(R.id.adi);
        fondoLuna = findViewById(R.id.fondoLuna);
        pbar1 = findViewById(R.id.pbar1);
        lunaController = new LunaController(this);


        Content content =  new Content();
        content.execute();

    }
    public class Content extends AsyncTask<Void,Void,Void> {
        //on post se procesa despues de doInBackground
        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);

            lunaController.aplicar();
            lunaController.asignarText();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            lunaController.procesar();

            return null;
        }


    }

    public void info (View v){

        Intent intento = new Intent(this, ActividadLuna2.class);
        startActivity(intento);

    }
    public void volver (View v){

        finish();

    }



}