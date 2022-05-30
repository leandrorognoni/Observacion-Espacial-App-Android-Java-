package com.example.espacio;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.espacio.controller.CalcuController;

public class ActividadCalcu extends AppCompatActivity {

    public TextView resultadoCal;
    public TextView resultadoTam;
    public TextView resultadoDis;
    public TextView tiCalcu;
    public TextView subtiCalcu;
    public ImageView imgFondo;
    public EditText tamaño;
    public EditText distancia;
    public EditText inputTamañoTam;
    public EditText inputGraTam;
    public EditText inputMinTam;
    public EditText inputSegTam;
    public EditText inputTamañoDis;
    public EditText inputGraDis;
    public EditText inputMinDis;
    public EditText inputSegDis;

    private CalcuController calcuController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_calcu);

        tiCalcu = findViewById(R.id.tiCalcu);
        subtiCalcu= findViewById(R.id.subtiCalcu);

        //angulo
        resultadoCal = findViewById(R.id.resultadoCal);
        imgFondo = findViewById(R.id.imgFondo);
        tamaño = findViewById(R.id.tamaño);
        distancia = findViewById(R.id.distancia);

        //tamaño
        resultadoTam = findViewById(R.id.resultadoTam);
        inputTamañoTam = findViewById(R.id.inputTamañoTam);
        inputGraTam = findViewById(R.id.inputGraTam);
        inputMinTam = findViewById(R.id.inputMinTam);
        inputSegTam = findViewById(R.id.inputSegTam);


        //distancia
        resultadoDis = findViewById(R.id.resultadoDis);
        inputTamañoDis = findViewById(R.id.inputTamañoDis);
        inputGraDis = findViewById(R.id.inputGraDis);
        inputMinDis = findViewById(R.id.inputMinDis);
        inputSegDis = findViewById(R.id.inputSegDis);

        calcuController = new CalcuController(this);


        this.calcuController.asignarTi();
        this.calcuController.cargarGlide();
    }

    public void calcular(View v){

        //Se envia por parametro el nombre del tag del boton que coincide con el metodo que realizara
        this.calcuController.asignarCalculo(v.getTag().toString());


    }

    public void volver (View v){
            finish();

    }






}



