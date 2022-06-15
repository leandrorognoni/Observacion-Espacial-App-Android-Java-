package com.example.espacio.controller;

import android.view.View;

import com.bumptech.glide.Glide;
import com.example.espacio.ActividadConstelacion;
import com.example.espacio.models.Constelacion;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ConstelacionController {

  private Constelacion constelacionModel;
  private  ActividadConstelacion actividadConstelacion;


    public ConstelacionController (ActividadConstelacion actividadConstelacion){
        this.actividadConstelacion = actividadConstelacion;
        this.constelacionModel = new Constelacion(this);

    }

    public void aplicar() {

      this.actividadConstelacion.textMostrar.setText(constelacionModel.getDescripcion());
     this.actividadConstelacion.titul.setText(constelacionModel.getTitulo());
      this.actividadConstelacion.textM2.setText(constelacionModel.getCaracteristicas());

       Glide.with(this.actividadConstelacion.getApplicationContext())
                .load(constelacionModel.getUrl_imagen())
                .into(this.actividadConstelacion.ivConste);

       actividadConstelacion.pbar3.setVisibility(View.GONE);

    }

    public void procesar( String textoIngresado  ) {


        if(!textoIngresado.isEmpty()){

            //Con cada procesar se vuelva vacio el contenido
            this.actividadConstelacion.textMostrar.setText("");
            this.actividadConstelacion.titul.setText("");
            this.actividadConstelacion.textM2.setText("");


            String titulo = constelacionModel.verificar(textoIngresado);
            String url = constelacionModel.getURL() + titulo;
            String descr;

            //Descr
            try {

                Document doc2 = Jsoup.connect(url).get();
                Elements contenido = doc2.select("#mw-content-text");
                descr = contenido.select("#mw-content-text").select("div.mw-parser-output").select("p").first().text();
                constelacionModel.asignarDescripcion(descr);
                descr = contenido.select("#mw-content-text").select("div.mw-parser-output").select("p").get(1).text();
                constelacionModel.asignarCaracteristicas(descr);
                constelacionModel.asignarTitutlo(textoIngresado);

            } catch (IOException e) {
                e.printStackTrace();
                constelacionModel.asignarDescripcion("Invalido, por favor verifique el nombre de la constelación.");
            }

            //se obtiene imagen
            try {

                Document doc2 = Jsoup.connect(url).get();
                Elements contenido = doc2.select("tbody");
                constelacionModel.asignarImagen(contenido.select("tbody").select("tr").select("td").select("a").
                        select("img").attr("src"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{

            actividadConstelacion.titul.setText("Ingrese una constelación");
            actividadConstelacion.pbar3.setVisibility(View.GONE);

        }

    }
}
