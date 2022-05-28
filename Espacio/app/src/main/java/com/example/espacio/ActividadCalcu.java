package com.example.espacio;

import androidx.appcompat.app.AppCompatActivity;


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
    public ImageView imgFondo;
    public EditText tamaño;
    public EditText distancia;
    public EditText inputTamañoTam;
    public EditText inputAnguloTam;
    public EditText inputTamañoDis;
    public EditText inputAnguloDis;
    private CalcuController calcuController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_calcu);

        resultadoCal = findViewById(R.id.resultadoCal);
        imgFondo = findViewById(R.id.imgFondo);
        tamaño = findViewById(R.id.tamaño);
        distancia = findViewById(R.id.distancia);

        resultadoTam = findViewById(R.id.resultadoTam);
        inputTamañoTam = findViewById(R.id.inputTamañoTam);
        inputAnguloTam = findViewById(R.id.inputAnguloTam);

        resultadoDis = findViewById(R.id.resultadoDis);
        inputTamañoDis = findViewById(R.id.inputTamañoDis);
        inputAnguloDis = findViewById(R.id.inputAnguloDis);

        calcuController = new CalcuController(this);

        this.calcuController.cargarGlide();
    }

    public void calcular(View v){

        //Se envia por parametro el nombre del tag del boton que coincide con el metodo que realizara
        this.calcuController.asignarCalculo(v.getTag().toString());


    }






}



