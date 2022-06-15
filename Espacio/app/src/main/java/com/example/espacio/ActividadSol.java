package com.example.espacio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.espacio.controller.SolController;

public class ActividadSol extends AppCompatActivity {

    public TextView titu1;
    public TextView subti;
    public TextView hora;
    public TextView inf;
    public ImageView iwSol1;
    public ImageView iwSol2;
    public ImageView iwSol3;
    public ImageView iwSol4;
    public ImageView iwSol5;
    public ImageView iwSol6;
    public ImageView iwSol7;
    public ImageView iwSol8;
    public ImageView f1;
    public ProgressBar pbar2;

    public SolController solController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_sol);

        titu1 = findViewById(R.id.titu1);
        subti = findViewById(R.id.subti);
        hora = findViewById(R.id.hora);
        inf = findViewById(R.id.inf);
        iwSol1 = findViewById(R.id.iwSol1);
        iwSol2 = findViewById(R.id.iwSol2);
        iwSol3 = findViewById(R.id.iwSol3);
        iwSol4 = findViewById(R.id.iwSol4);
        iwSol5 = findViewById(R.id.iwSol5);
        iwSol6 = findViewById(R.id.iwSol6);
        iwSol7 = findViewById(R.id.iwSol7);
        iwSol8 = findViewById(R.id.iwSol8);
        pbar2 = findViewById(R.id.pbar2);
        f1 = findViewById(R.id.f1);

        solController = new SolController(this);

        Content content =  new  Content();
        content.execute();

    }

    public class Content extends AsyncTask<Void,Void,Void> {
        //on post se procesa despues de doInBackground
        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);
            solController.aplicar();

        }

        @Override
        protected Void doInBackground(Void... voids) {

            solController.procesar();
            return null;
        }


    }
}