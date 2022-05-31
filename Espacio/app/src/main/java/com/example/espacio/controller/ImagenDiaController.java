package com.example.espacio.controller;

import android.view.View;

import com.bumptech.glide.Glide;
import com.example.espacio.ActividadImagDia;
import com.example.espacio.ActividadSol;
import com.example.espacio.models.ImagenDiaModel;
import com.example.espacio.models.SolModel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ImagenDiaController {

    private ImagenDiaModel imagenDiaModel;
    private ActividadImagDia actividadImagDia;

    public ImagenDiaController(ActividadImagDia actividadImagDia) {
        this.actividadImagDia = actividadImagDia;
        this.imagenDiaModel = new ImagenDiaModel(this);

    }

    public void aplicar() {

        this.actividadImagDia.titulo.setText(imagenDiaModel.getTitulo());
        this.actividadImagDia.subti1.setText(imagenDiaModel.getSubt());
        this.actividadImagDia.fecha.setText(imagenDiaModel.getFecha());
        this.actividadImagDia.descopy.setText( imagenDiaModel.getCopyrightFoto());

        Glide.with(this.actividadImagDia.getApplicationContext())
                .load(imagenDiaModel.getUrl() + imagenDiaModel.getImagen())
                .into(this.actividadImagDia.iw1);

        actividadImagDia.pbar.setVisibility(View.GONE);
    }


    public void procesar() {
       String url = imagenDiaModel.getUrlImg();


        //foto
        try {

            Document doc2 = Jsoup.connect(url).get();
            Elements contenido = doc2.select("center");
            imagenDiaModel.asignarImagen(contenido.select("center").select("p").select("a").select("img").attr("src"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        //copyright imagen
        try {

            Document doc2 = Jsoup.connect(url).get();
            Elements contenido = doc2.select("center");
            String texto = contenido.get(1).text();
            String [] partes = texto.split(": ");
            imagenDiaModel.asignarCopy(partes[1]) ;

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
