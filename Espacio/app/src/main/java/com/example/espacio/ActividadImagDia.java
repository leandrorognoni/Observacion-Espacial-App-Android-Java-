package com.example.espacio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.espacio.controller.ImagenDiaController;

public class ActividadImagDia extends AppCompatActivity {

    public TextView titulo;
    public TextView subti1;
    public TextView fecha;
    public TextView descopy;
    public ImageView iw1;
    public ProgressBar pbar;

    public ImagenDiaController imagenDiaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_dia);

        titulo = findViewById(R.id.titulo);
        subti1 = findViewById(R.id.subti1);
        fecha = findViewById(R.id.fecha);
        descopy = findViewById(R.id.descopy);
        iw1 = findViewById(R.id.iw1);
        pbar = findViewById(R.id.pbar);
        imagenDiaController = new ImagenDiaController(this);

        Content content =  new Content();
        content.execute();

    }


    public class Content extends AsyncTask<Void,Void,Void> {
        //on post se procesa despues de doInBackground
        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);
            imagenDiaController.aplicar();

        }

        @Override
        protected Void doInBackground(Void... voids) {

            imagenDiaController.procesar();
            return null;
        }


    }

    public void volver (View v){

        finish();

    }
}