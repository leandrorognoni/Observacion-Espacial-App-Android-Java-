package com.example.espacio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.espacio.controller.ConstelacionController;

public class ActividadConstelacion extends AppCompatActivity {

    public EditText edit1;
    public ImageView ivConste;
    public ImageView fndConstela;
    public TextView titul;
    public TextView textMostrar;
    public TextView textM2;
    public ConstelacionController constelacionController;
    public ProgressBar pbar3;
    private String textoIngresado;
    private final String FONDO  = "https://c.tenor.com/DVzVKfkHYJcAAAAd/galaxy-space.gif";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_constelacion);

        edit1 = findViewById(R.id.edit1);
        ivConste = findViewById(R.id.ivConste);
        fndConstela = findViewById(R.id.fndConstela);
         titul = findViewById(R.id.titul);
        textMostrar = findViewById(R.id.textMostrar);
        textM2 = findViewById(R.id.textM2);
        pbar3 = findViewById(R.id.pbar3);
        pbar3.setVisibility(View.GONE);

        constelacionController = new ConstelacionController(this);

       Glide.with(this.getApplicationContext())
               .load(FONDO)
                .into(this.fndConstela);
    }


    public void buscar (View v){

        pbar3.setVisibility(View.VISIBLE);
         Content content = new Content();
         content.execute();

    }

    public class Content extends AsyncTask<Void,Void,Void> {


        //on post se procesa despues de doInBackground
        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);
            if(!edit1.getText().toString().isEmpty()){
                constelacionController.aplicar();
            }


        }

        @Override
        protected Void doInBackground(Void... voids) {
            textoIngresado  = edit1.getText().toString();
            constelacionController.procesar(textoIngresado);


            return null;
        }


    }


    public void volver (View v){

        finish();

    }

}