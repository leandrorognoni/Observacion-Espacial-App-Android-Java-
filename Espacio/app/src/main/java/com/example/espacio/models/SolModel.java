package com.example.espacio.models;

import com.example.espacio.controller.SolController;
import com.example.espacio.utilidades.HorarioFecha;

import java.util.ArrayList;

public class SolModel {

    private ArrayList<String> urlImagenes;
    private HorarioFecha hora;


    private SolController solController;
    private String horario;

    private final String TITULO = "Observación Solar"   ;
    private final String SUB_TIT = "Captadas en los últimos minutos por Telescopio del Observatorio de Dinámica Solar \n";
    private final String INFO = "Considere el horario UTC (Tiempo Universal Coordinado) indicado en las imagenes (ARG UTC -3)";

    private final String URL_PRINCIPAL = "https://sdo.gsfc.nasa.gov";
    private final String URL_DATA = "https://sdo.gsfc.nasa.gov/data";
    private final String URL_FONDO_TITULO = "https://thumbs.gfycat.com/AdeptFalseJunco-size_restricted.gif";

    public SolModel (SolController solController){
        this.solController = solController;
        this.urlImagenes = new ArrayList<>();
        this.hora = new HorarioFecha();
        setHora();
    }

    private void setHora() {
       horario=  "ARG "  + hora.getHorarioArg() + "\nUTC "+ hora.getHorarioUTC();
    }

    public String getURL_PRINCIPAL() {
        return URL_PRINCIPAL;
    }

    public String getURL_DATA() {
        return URL_DATA;
    }

    public void agregarImagen (String urlImagen){
        urlImagenes.add(urlImagen);

    }

    public String getSUB_TIT() {
        return SUB_TIT;
    }

    public String gethorario() {
        return horario;
    }

    public String getINFO() {
        return INFO;
    }

    public ArrayList<String> getArrayListImagenes() {
        return urlImagenes;
    }

    public String getTITULO (){
        return TITULO;
    }

    public String getURL_FONDO_TITULO(){
        return URL_FONDO_TITULO;
    }
}

