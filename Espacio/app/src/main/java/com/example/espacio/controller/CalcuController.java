package com.example.espacio.controller;

import com.bumptech.glide.Glide;
import com.example.espacio.ActividadCalcu;
import com.example.espacio.models.CalculModel;

public class CalcuController {

  private ActividadCalcu actividadCalcu;
  private CalculModel calculModel;

    public CalcuController  (ActividadCalcu actividadCalcu) {
        this.actividadCalcu = actividadCalcu;
        this.calculModel = new CalculModel(this) ;

    }


    public void asignarCalculo(String seleccion ){

        if( seleccion.equals("angulo")){
            double v1 = Double.parseDouble(this.actividadCalcu.tamaño.getText().toString());
            double v2 = Double.parseDouble( this.actividadCalcu.distancia.getText().toString());
            String total = this.calculModel.calcularAngu(v1,v2);
            this.actividadCalcu.resultadoCal.setText(total);

        }



    }

    public void cargarGlide() {

        Glide.with(this.actividadCalcu.getApplicationContext())
                .load( calculModel.getURL_FOND())
                .into(this.actividadCalcu.imgFondo);

    }
}
