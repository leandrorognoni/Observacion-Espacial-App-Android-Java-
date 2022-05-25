package com.example.espacio.utilidades;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class HorarioFecha {

    private   String horarioArg ;
    private   String horarioUTC;
    private   String fechaArg;


    public HorarioFecha(){
        setFechaArg();
        sethoraActual();
        setHoraUtc();

    }

    private void setFechaArg() {
        Date actual = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String Date = simpleDateFormat.format(actual);
        fechaArg = Date;

    }

    private void sethoraActual(){

        Date actual = new Date();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Argentina/Buenos_Aires"));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String Date = simpleDateFormat.format(actual);
        horarioArg = Date;
    }

    private void setHoraUtc(){

        Date actual = new Date();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String Date = simpleDateFormat.format(actual);

        horarioUTC = Date;
    }


    public   String getHorarioArg() {
        return horarioArg;
    }

    public   String getHorarioUTC() {
        return horarioUTC;
    }

    public String getFechaArg() {
        return fechaArg;
    }
}
