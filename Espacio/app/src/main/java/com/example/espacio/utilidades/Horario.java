package com.example.espacio.utilidades;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Horario {

    private   String horarioArg ;
    private   String horarioUTC;


    public Horario (){
        sethoraActual();
        setHoraUtc();
    }
    private void sethoraActual(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String Date = simpleDateFormat.format(calendar.getTime());

        horarioArg = Date;
    }

    private void setHoraUtc(){

       String dato = " ";
        horarioUTC = dato;
    }


    public   String getHorarioArg() {
        return horarioArg;
    }

    public   String getHorarioUTC() {
        return horarioArg;
    }
}
