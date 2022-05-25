package com.example.espacio.models;

import com.example.espacio.controller.ImagenDiaController;
import com.example.espacio.controller.SolController;
import com.example.espacio.utilidades.HorarioFecha;

public class ImagenDiaModel {

    private final String urlImg = "https://apod.nasa.gov/apod/astropix.html";
    private final String url = "https://apod.nasa.gov/apod/";
    private String imagen;
    private String titulo;
    private String subt;
    private String fecha;
    private String copyrightFoto;
    private ImagenDiaController imagenDiaController;
    private HorarioFecha horaFecha;

    public ImagenDiaModel (ImagenDiaController imagenDiaController){
            this.imagenDiaController = imagenDiaController;
            horaFecha = new HorarioFecha();
            setTitulo();
            setSubt();
            setFecha();
            setCopyRight();


    }

    private void setTitulo(){
        this.titulo = "Imagen Astronómica del día";
    }
    private void setSubt(){
        this.subt = "Cada día se presenta una imagen o fotografía diferente de nuestro fascinante universo.";
    }

    public String getSubt() {
        return subt;
    }

    private void setFecha() {
         this.fecha = horaFecha.getFechaArg() ;

    }

    private void setCopyRight(){

    }

    public String getUrlImg() {
        return urlImg;
    }

    public String getUrl() {
        return url;
    }

    public void asignarImagen( String imagen){
        this.imagen = imagen;
    }

    public void asignarCopy( String copy){
        this.copyrightFoto = "Autor de la imagen: " + copy ;
    }

    public String getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCopyrightFoto() {
        return copyrightFoto;
    }
}
