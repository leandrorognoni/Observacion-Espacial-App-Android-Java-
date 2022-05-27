package com.example.espacio.models;

import com.example.espacio.controller.CalcuController;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CalculModel {

    private final int CONSTANTE_DE_FORMULA = 2;
    private final String CONVERS_SEXAG = "0.";
    private final double MULTIPL_SEXAG = 60;
    private final String URL_FOND = "https://c.tenor.com/53I_s_sx9ncAAAAC/black-space-stars.gif";

    private CalcuController calcuController;

    public CalculModel (CalcuController calcuController){
        this.calcuController = calcuController;

    }


    public String calcularAngu ( double diametro , double distancia){
        String aDevolver= "";
        double tamañoDiam = diametro;
        double distanc = distancia;

        double anguloVisual_diametroAngular;

        String grados;
        String minutos;
        String segundos;
        String milesima;

        distanc = distanc * CONSTANTE_DE_FORMULA;
        anguloVisual_diametroAngular = tamañoDiam / distanc;
         //arcotangente
        anguloVisual_diametroAngular = (Math.atan(anguloVisual_diametroAngular)) * CONSTANTE_DE_FORMULA;
         //radianes a grados
         anguloVisual_diametroAngular = Math.toDegrees(anguloVisual_diametroAngular);
         String cadenaResultado = String.valueOf(anguloVisual_diametroAngular);

         //Se obtienen grados
         String[] partesCompleto= cadenaResultado.split("\\.");
         grados =  partesCompleto[0];

        //se obtienen minutos, segundos y ms
        String[]partesMinutosSeg =  obtenerDecimal( partesCompleto[1]);
        minutos = partesMinutosSeg[0];

        String []partesSegundos = obtenerDecimal(partesMinutosSeg[1]);
        segundos = partesSegundos[0];
        milesima = partesSegundos[1].substring(0,3);

        if(Integer.parseInt(grados) == 0){
            aDevolver =  minutos + " ' " + segundos + " ''" + milesima + " ms"  ;
        }else{
            aDevolver = grados + "° " + minutos + " ' " + segundos + " ''" + milesima + " ms";
        }

        return aDevolver;
    }

    public String[] obtenerDecimal(String numeroCadena ){

        double parte;
        String cadenaMinutoSeg;
        String[] partesMinutosSeg;

        parte = Double.parseDouble(CONVERS_SEXAG + numeroCadena);
        parte = parte * MULTIPL_SEXAG;
        cadenaMinutoSeg = String.valueOf(parte);
        partesMinutosSeg = cadenaMinutoSeg.split("\\.");

        return partesMinutosSeg;


    }


    public String calcularTamaño(double dis, double angul ){
            String aDevolver= "";
            double distancia = dis;
            double angulo = angul;
            double tamaño;


            angulo = angulo / CONSTANTE_DE_FORMULA;
            angulo = (Math.toRadians(angulo));
            distancia = CONSTANTE_DE_FORMULA * distancia;
            angulo =  Math.tan(angulo) ;


            tamaño = angulo * distancia;
            //redondear
            DecimalFormat decimalForm = new DecimalFormat("#0.000");
            decimalForm.setRoundingMode(RoundingMode.HALF_DOWN);

            aDevolver = decimalForm.format(tamaño);
            return aDevolver;
        //resultadoCal.setText(  decimalForm.format(tamaño) );

    }


    public String calcularDistancia(double ang , double diametro ) {

        String aDevolver = "";
        double angulo = ang;
        double tamaño = diametro;
        double distancia;


        tamaño = tamaño / CONSTANTE_DE_FORMULA;
        angulo =  angulo  / CONSTANTE_DE_FORMULA;
        angulo = Math.toRadians(angulo);
        angulo =  Math.tan(angulo) ;
        distancia = tamaño / angulo;

        //redondear
        DecimalFormat decimalForm = new DecimalFormat("#0.000");
        decimalForm.setRoundingMode(RoundingMode.HALF_DOWN);

        aDevolver = decimalForm.format(distancia);

        return aDevolver;
        //resultadoCal.setText(  decimalForm.format(distancia) );

    }

    public String getURL_FOND() {
        return URL_FOND;
    }
}
