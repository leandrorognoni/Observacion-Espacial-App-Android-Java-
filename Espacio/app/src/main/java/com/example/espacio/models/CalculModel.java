package com.example.espacio.models;

import com.example.espacio.controller.CalcuController;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CalculModel {

    private final int CONSTANTE_DE_FORMULA = 2;
    private final String CONVERS_SEXAG = "0.";
    private final double MULTIPL_SEXAG = 60;
    private final double SEXAG_CAL = 3600;
    private final String URL_FOND = "https://c.tenor.com/53I_s_sx9ncAAAAC/black-space-stars.gif";
    private final String M_AÑOS_LUZ = "Mal";
    private String titulo;
    private String subtitulo;

    private CalcuController calcuController;

    public CalculModel (CalcuController calcuController){
        this.calcuController = calcuController;
        setTitulo();
        setSubti();

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


public String calcularTamaño(double dis, double grado, double min, double segundos ){
    String aDevolver= "";
    double distancia = dis;
    double gra = grado;
    double m = min;
    double seg = segundos;
    double angulo;
    double tamaño;

    //convertir grados a decimales
    angulo = grado + (min / MULTIPL_SEXAG ) + (seg / SEXAG_CAL);

    angulo = angulo / CONSTANTE_DE_FORMULA;
    angulo = (Math.toRadians(angulo));
    distancia = CONSTANTE_DE_FORMULA * distancia;
    angulo =  Math.tan(angulo) ;


    tamaño = angulo * distancia;
    //redondear
    DecimalFormat decimalForm = new DecimalFormat("#0.000");
    decimalForm.setRoundingMode(RoundingMode.HALF_DOWN);

    aDevolver = decimalForm.format(tamaño);
    aDevolver= aDevolver + " " + M_AÑOS_LUZ;
    return aDevolver;


}


    public String calcularDistancia(double diametro , double grados, double min, double seg ) {

        String aDevolver = "";
        double tamaño = diametro;
        double gra = grados;
        double minu = min;
        double segu = seg;
        double angulo;
        double distancia;


        //convertir grados a decimales
        angulo = gra + (minu / MULTIPL_SEXAG ) + (segu / SEXAG_CAL);

        tamaño = tamaño / CONSTANTE_DE_FORMULA;
        angulo =  angulo  / CONSTANTE_DE_FORMULA;
        angulo = Math.toRadians(angulo);
        angulo =  Math.tan(angulo) ;
        distancia = tamaño / angulo;

        //redondear
        DecimalFormat decimalForm = new DecimalFormat("#0.000");
        decimalForm.setRoundingMode(RoundingMode.HALF_DOWN);

        aDevolver = decimalForm.format(distancia);
        aDevolver= aDevolver + " " + M_AÑOS_LUZ;

        return aDevolver;

    }

    public String getURL_FOND() {
        return URL_FOND;
    }

    private void setTitulo() {
        this.titulo = "Calculadora de Paralaje";
    }

    private void setSubti() {
        this.subtitulo = "* Mal = Millones de Años Luz. \nLos siguientes resultados son" +
                " validos hasta una distancia de 100 Mal.";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }
}
