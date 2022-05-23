package com.example.espacio.models;

import android.text.format.Time;

import com.bumptech.glide.Glide;
import com.example.espacio.ActividadSol;
import com.example.espacio.controller.SolController;
import com.example.espacio.utilidades.Horario;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.ArrayList;
import java.util.Date;

public class SolModel {

    private ArrayList<String> urlImagenes;
    Horario hora;


    private SolController solController;
    private String horario;

    private final String TITULO = "Observación Solar"   ;
    private final String SUB_TIT = "Captadas en los últimos minutos por Telescopio del Observatorio de Dinámica Solar \n";
    private final String INFO = "Considere el horario UTC (Tiempo Universal Coordinado) indicado en las imagenes (ARG UTC -3)";

    private final String URL_PRINCIPAL = "https://sdo.gsfc.nasa.gov";
    private final String URL_DATA = "https://sdo.gsfc.nasa.gov/data";
    private final String URL_FONDO_TITULO = "https://c.tenor.com/lEuZK57PtxIAAAAC/space-stars.gif";

    public SolModel (SolController solController){
        this.solController = solController;
        this.urlImagenes = new ArrayList<>();
        this.hora = new Horario();
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

