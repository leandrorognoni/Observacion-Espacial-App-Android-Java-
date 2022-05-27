package com.example.espacio.controller;

import com.bumptech.glide.Glide;
import com.example.espacio.ActividadSol;
import com.example.espacio.models.SolModel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class SolController {

    private SolModel solModel;
    private ActividadSol actividadSol;


    public SolController(ActividadSol actividadSol) {
        this.actividadSol = actividadSol;
        this.solModel = new SolModel(this);

    }

    public void aplicarGlide() {

        this.actividadSol.titu1.setText(solModel.getTITULO());
        this.actividadSol.subti.setText(solModel.getSUB_TIT());

        this.actividadSol.hora.setText(solModel.gethorario());
        this.actividadSol.inf.setText(solModel.getINFO());

      Glide.with(this.actividadSol.getApplicationContext())
               .load(solModel.getURL_FONDO_TITULO())
                .into(this.actividadSol.f1);

        Glide.with(this.actividadSol.getApplicationContext())
                .load(solModel.getURL_PRINCIPAL() +  solModel.getArrayListImagenes().get(0))
                .into(this.actividadSol.iwSol1);


        Glide.with(this.actividadSol.getApplicationContext())
                .load(solModel.getURL_PRINCIPAL() + solModel.getArrayListImagenes().get(1))
                .into(this.actividadSol.iwSol2);

         Glide.with(this.actividadSol.getApplicationContext())
                  .load(solModel.getURL_PRINCIPAL() + solModel.getArrayListImagenes().get(2))
                  .into(this.actividadSol.iwSol3);


        Glide.with(this.actividadSol.getApplicationContext())
                .load(solModel.getURL_PRINCIPAL() + solModel.getArrayListImagenes().get(3))
                .into(this.actividadSol.iwSol4);

        Glide.with(this.actividadSol.getApplicationContext())
                .load(solModel.getURL_PRINCIPAL() + solModel.getArrayListImagenes().get(4))
                .into(this.actividadSol.iwSol5);


        Glide.with(this.actividadSol.getApplicationContext())
                .load(solModel.getURL_PRINCIPAL() + solModel.getArrayListImagenes().get(5))
                .into(this.actividadSol.iwSol6);

        Glide.with(this.actividadSol.getApplicationContext())
                .load(solModel.getURL_PRINCIPAL() + solModel.getArrayListImagenes().get(6))
                .into(this.actividadSol.iwSol7);


        Glide.with(this.actividadSol.getApplicationContext())
                .load(solModel.getURL_PRINCIPAL() + solModel.getArrayListImagenes().get(7))
                .into(this.actividadSol.iwSol8);







    }

    public void procesar() {
        String url = solModel.getURL_DATA();

        //Fotos

        try {

            Document doc2 = Jsoup.connect(url).get();
            Elements contenido = doc2.select("div.imagedata");
            Elements contenido2 = doc2.select("#aia_0304");
            Elements contenido3 = doc2.select("#aia_0171");
            Elements contenido4 = doc2.select("#aia_0211");
            Elements contenido5 = doc2.select("#aia_0131");
            Elements contenido6 = doc2.select("#aia_0335");
            Elements contenido7 = doc2.select("#aia_0094");
            Elements contenido8 = doc2.select("#aia_1600");
            String urlImgSol  =    contenido.select("div.imagedata").select("img").attr("src");
            String urlImgSol2 =    contenido2.select("#aia_0304").select("div.imagedata").select("a").attr("href");
            String urlImgSol3 =    contenido3.select("#aia_0171").select("div.imagedata").select("a").attr("href");
            String urlImgSol4 =    contenido4.select("#aia_0211").select("div.imagedata").select("a").attr("href");
            String urlImgSol5 =    contenido5.select("#aia_0131").select("div.imagedata").select("a").attr("href");
            String urlImgSol6 =    contenido6.select("#aia_0335").select("div.imagedata").select("a").attr("href");
            String urlImgSol7 =    contenido7.select("#aia_0094").select("div.imagedata").select("a").attr("href");
            String urlImgSol8 =    contenido8.select("#aia_1600").select("div.imagedata").select("a").attr("href");

            //Se agregar al ArrayList de SolModel cada Url de cada imagen
            solModel.agregarImagen(urlImgSol);
            solModel.agregarImagen(urlImgSol2);
            solModel.agregarImagen(urlImgSol3);
            solModel.agregarImagen(urlImgSol4);
            solModel.agregarImagen(urlImgSol5);
            solModel.agregarImagen(urlImgSol6);
            solModel.agregarImagen(urlImgSol7);
            solModel.agregarImagen(urlImgSol8);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

