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

        double v1;
        double v2;
        double grados;
        double min;
        double seg;

        if( seleccion.equals("angulo")){
              v1 = Double.parseDouble(this.actividadCalcu.tamaño.getText().toString());
              v2 = Double.parseDouble( this.actividadCalcu.distancia.getText().toString());
            String total = this.calculModel.calcularAngu(v1,v2);
            this.actividadCalcu.resultadoCal.setText(total);

        }else if(seleccion.equals("tamaño")){
            v1 = Double.parseDouble(this.actividadCalcu.inputTamañoTam.getText().toString());
            grados =  Double.parseDouble(this.actividadCalcu.inputGraTam.getText().toString());
            min =  Double.parseDouble(this.actividadCalcu.inputMinTam.getText().toString());
            seg =  Double.parseDouble(this.actividadCalcu.inputSegTam.getText().toString());
            String totalTam = this.calculModel.calcularTamaño(v1,grados , min, seg);

            this.actividadCalcu.resultadoTam.setText(totalTam);
        }else {
            v1 = Double.parseDouble(this.actividadCalcu.inputTamañoDis.getText().toString());
            grados =  Double.parseDouble(this.actividadCalcu.inputGraDis.getText().toString());
            min =  Double.parseDouble(this.actividadCalcu.inputMinDis.getText().toString());
            seg =  Double.parseDouble(this.actividadCalcu.inputSegDis.getText().toString());

            String totalTam = this.calculModel.calcularDistancia(v1,grados,min,seg);

            this.actividadCalcu.resultadoDis.setText(totalTam);

        }



    }

    public void cargarGlide() {

        Glide.with(this.actividadCalcu.getApplicationContext())
                .load( calculModel.getURL_FOND())
                .into(this.actividadCalcu.imgFondo);

    }

    public void asignarTi() {
        this.actividadCalcu.tiCalcu.setText(calculModel.getTitulo());
        this.actividadCalcu.subtiCalcu.setText(calculModel.getSubtitulo());
    }
}
