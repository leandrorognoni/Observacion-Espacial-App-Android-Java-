package com.example.espacio.controller;

import android.view.View;

import com.bumptech.glide.Glide;
import com.example.espacio.ActividadLuna;
import com.example.espacio.ActividadLuna2;
import com.example.espacio.models.Luna;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LunaController {


    private Luna lunaModel;
    private ActividadLuna lunaActividad;
    private ActividadLuna2 lunaActividad2;


    public LunaController (ActividadLuna luna) {
            this.lunaActividad = luna;
            this.lunaModel = new Luna(this);

    }

    public LunaController (ActividadLuna2 luna2) {
        this.lunaActividad2 = luna2;
        this.lunaModel = new Luna(this);

    }


    public void aplicar() {
        this.lunaActividad.t1luna.setText(lunaModel.getTitulo());
        this.lunaActividad.t1luna2.setText(lunaModel.getFecha());
        this.lunaActividad.t1luna3.setText(lunaModel.getEstado());
        this.lunaActividad.t2luna.setText(lunaModel.getDistanciaActual());



        Glide.with(this.lunaActividad.getApplicationContext())
                .load("https:" + lunaModel.getUrlImgLuna())
                .into(this.lunaActividad.iwluna);

        Glide.with(lunaActividad.getApplicationContext())
                .load(lunaModel.getURL_LUNAFONDO())
                .into(this.lunaActividad.fondoLuna);

        lunaActividad.pbar1.setVisibility(View.GONE);

    }

     public void procesar() {

        String url = lunaModel.getURL_PRINCIPAL();
        String fechaYestado = lunaModel.getFECHA_ESTADO();
        String distancia = lunaModel.getURL_DISTANCIA();

        //Estado actual de la luna
        try {
            Document doc2 = Jsoup.connect(fechaYestado).get();
            Elements contenido = doc2.select("div.mlistados");
            String urlFecha = contenido.select("p").text();
            String [] partes = urlFecha.split(", ");
            String segundo = partes[1];
            String [] partes2 = segundo.split("Hoy");

           lunaModel.asignarTitulo(partes[0]);
           lunaModel.asignarFecha(partes2[0]);
           lunaModel.asignarEstado(partes2[1]);


        } catch (IOException e) {
            e.printStackTrace();
        }

        //foto
        try {

            Document doc2 = Jsoup.connect(url).get();
            Elements contenido = doc2.select("div.img");

             lunaModel.asignarFoto(contenido.select("div.img").select("img").attr("src"));

        } catch (IOException e) {
            e.printStackTrace();
        }

         //Distancia actual
         try {

             Document doc2 = Jsoup.connect(distancia).get();
             Elements contenido = doc2.select("div.keyinfobox");
             String distanciaActual = contenido.select("div.keyinfobox").select("ar").text();
             String [] partesKm = distanciaActual.split(" ");
             lunaModel.asignarDistancia(partesKm[0]);

         } catch (IOException e) {
             e.printStackTrace();
         }
    }


    public void asignarText(){
        this.lunaActividad.descTitu.setText( this.lunaModel.getTituloDescrip() );
        this.lunaActividad.desc.setText( this.lunaModel.getDescripcion() );
        this.lunaActividad.adi.setText( this.lunaModel.getAdicional() );
    }


    public void aplicarTextSegundaActividadLuna(){
        this.lunaActividad2.ti1.setText( this.lunaModel.getTitulo2()  );
        this.lunaActividad2.desc1.setText( this.lunaModel.getSegundaDesc()  );
        this.lunaActividad2.ti2.setText( this.lunaModel.getTitulo3()  );
        this.lunaActividad2.desc2.setText( this.lunaModel.getTerceraDesc());
        this.lunaActividad2.desc3.setText( this.lunaModel.getCuartaDesc()  );


    }


}

