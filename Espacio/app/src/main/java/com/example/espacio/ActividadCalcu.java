package com.example.espacio;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.espacio.controller.CalcuController;
import com.example.espacio.controller.LunaController;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ActividadCalcu extends AppCompatActivity {

    public TextView resultadoCal;
    public ImageView imgFondo;
    public EditText tamaño;
    public EditText distancia;
    private CalcuController calcuController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_calcu);

        resultadoCal = findViewById(R.id.resultadoCal);
        tamaño = findViewById(R.id.tamaño);
        distancia = findViewById(R.id.distancia);
        imgFondo = findViewById(R.id.imgFondo);
        calcuController = new CalcuController(this);

        this.calcuController.cargarGlide();
    }

    public void calcularAngu (View v){



        //Se envia por parametro el nombre del tag del boton que coincide con el metodo que realizara
        this.calcuController.asignarCalculo(v.getTag().toString());


    }






}



