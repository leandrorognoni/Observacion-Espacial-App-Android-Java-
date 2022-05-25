package com.example.espacio.models;

import com.example.espacio.controller.ConstelacionController;

import java.util.ArrayList;

public class ConstelacionModel {


    private final String URL = "https://es.wikipedia.org/wiki/";
    private String titulo;
    private String descripcion;
    private String url_imagen ;
    private String caracteristicas ;
    private ConstelacionController constelacionController;
    private ArrayList<String> nombresPosibles;

    public ConstelacionModel (ConstelacionController constelacionController){
        this.constelacionController = constelacionController;
        this.nombresPosibles = new ArrayList<>();
        agregarNombresPosibles();
    }

    private void agregarNombresPosibles() {

        nombresPosibles.add("Vulpecula");
        nombresPosibles.add("Pictor");
        nombresPosibles.add("Cetus");
        nombresPosibles.add("Osa Menor");
        nombresPosibles.add("Osa Mayor");
        nombresPosibles.add("Coma Berenices");
        nombresPosibles.add("Corona Australis");
        nombresPosibles.add("Corona Borealis");
        nombresPosibles.add("Canis Maior");
        nombresPosibles.add("Camelopardalis");
        nombresPosibles.add("Canis Minor");
        nombresPosibles.add("Carina");
        nombresPosibles.add("Canes Venatici");
        nombresPosibles.add("Apus");
        nombresPosibles.add("Puppis");
        nombresPosibles.add("Vulpecula");

    }


    public String getURL (){
        return URL;

    }

    public void asignarDescripcion(String desc) {
        this.descripcion = desc;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public String verificar( String textoIngresado) {
        String textAdevolver;
        String finalUrlSiCorresponde = "_(constelacion)";
        String primeraLetra = textoIngresado.substring(0,1).toUpperCase();
        String restoDeLaCadena = textoIngresado.substring(1).toLowerCase();
        textAdevolver = primeraLetra + restoDeLaCadena;



          if(!estaEnListado(textAdevolver)) {
              textAdevolver += finalUrlSiCorresponde;

          }else if(textAdevolver.equalsIgnoreCase("Centauro")){
              textAdevolver = "Centaurus";
          }else if(textAdevolver.equalsIgnoreCase("Cruz del sur")){
              textAdevolver = "Crux";
          }else if(textAdevolver.equalsIgnoreCase("Boyero")){
              textAdevolver = "Bootes";
          }else if(textAdevolver.equalsIgnoreCase("Cincel")){
              textAdevolver = "Caelum";
          }else if(textAdevolver.equalsIgnoreCase("Serpiente")){
             textAdevolver = "Serpens";
          }else if(textAdevolver.equalsIgnoreCase("Triangulo")){
            textAdevolver = "Triangulum";
          }else if(textAdevolver.equalsIgnoreCase("Camaleon")){
              textAdevolver = "Chamaeleon";
          }else if(textAdevolver.equalsIgnoreCase("Telescopio")){
             textAdevolver = "Telescopium";
          }else if(textAdevolver.equalsIgnoreCase("Sextante")){
              textAdevolver = "Sextans ";
          }





            return textAdevolver;
    }


    private boolean estaEnListado(String nombre){
            boolean encontre = false;
            int i = 0;

            while(i<nombresPosibles.size() && !encontre ){
                if(nombresPosibles.get(i).equalsIgnoreCase("nombre")){
                    encontre = true;
                }else{
                    i++;
                }

            }
        return encontre;

    }

    public void asignarTitutlo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void asignarImagen(String imagenUrl) {
        this.url_imagen = "https:" + imagenUrl;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void asignarCaracteristicas(String caracteristicas){
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas(){
        return caracteristicas;

    }

}
