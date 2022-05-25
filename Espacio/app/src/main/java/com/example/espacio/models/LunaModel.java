package com.example.espacio.models;

import com.example.espacio.controller.LunaController;

public class LunaModel {



    private String tituloDescrip;
    private String descripcion;
    private String adicional;
    private String urlImgLuna;
    private String titulo;
    private String distanciaActual;
    private String fecha;
    private String estado;
    private String titulo2;
    private String segundaDesc;
    private String titulo3;
    private String terceraDesc;
    private String cuartaDesc;

    private final String URL_PRINCIPAL = "https://phasesmoon.com/";
    private final String FECHA_ESTADO= "https://www.tutiempo.net/luna/luna-hoy.html";
    private final String URL_LUNAFONDO = "https://64.media.tumblr.com/4041e9f54accee2eb348f3a2fb6af207/tumblr_oj7kzs6uit1qeyvpto1_500.gifv";
    private final String URL_DISTANCIA = "https://theskylive.com/how-far-is-moon";
    private LunaController lunaController;

    public LunaModel (LunaController lunaController){
        this.lunaController = lunaController;
        this.setDescripcion();
        this.setAdicional();
        this.setTituloDescrip();
        this.setTitulo2();
        this.setDescripcion2();
        this.setTitulo3();
        this.setTerceraDesc();
        this.setCuartaDesc();
    }


    private void setTituloDescrip() {
        this.tituloDescrip = "Explicación - Fases Lunares\n";

    }

    private void setDescripcion() {
        this.descripcion = "La luna no se percibe con la misma iluminación desde nuestro planeta todos los días, " +
                "sino que pasa por distintas fases o etapas atendiendo a su posición con respecto a la Tierra y el Sol. \n" +
                "\n Las principales fases por las que pasa el satélite son cuatro y se conocen como: luna nueva," +
                " cuarto creciente, llena y cuarto menguante. \n";


    }

    private void setAdicional(){
        this.adicional =  "\nHasta llegar a estas, acontecen fases intermedias conocidas como: creciente cóncava," +
                " creciente convexa, menguante convexa y menguante cóncava.\n" +
                "\nLa luna es un satélite que no tiene luz propia, es por ello que se puede ver gracias" +
                " a la luz que el sol refleja sobre su superficie.  Las fases lunares responden a cómo podemos " +
                "ver la luna iluminada desde nuestro planeta. Cada fase lunar dura aproximadamente una semana y " +
                "un ciclo lunar tarda en completarse 29,5 días, a este período se le conoce como lunación. \n" ;


    }

    private void setTitulo2(){
        this.titulo2 = "Origen de la Luna";

    }

    private void setDescripcion2() {
        this.segundaDesc = "El origen de la Luna generalmente se explica por un cuerpo del tamaño de Marte que" +
                " golpea la Tierra, formando un anillo de escombros que eventualmente se acumuló en un solo satélite natural," +
                " la Luna, pero también hay una serie de variaciones en esta hipótesis de impacto gigante. como explicaciones alternativas, " +
                "y la investigación continúa sobre cómo surgió la Luna. Otros escenarios propuestos incluyen cuerpo capturado, fisión, " +
                "formados juntos (teoría de la condensación, Sinesia), colisiones planetesimales (formadas a partir de cuerpos similares a" +
                " asteroides) y teorías de colisión.\n"
                + "\n" +
                "La hipótesis estándar de impacto gigante sugiere que el cuerpo del tamaño de Marte, llamado Tea, impactó la proto-Tierra," +
                " creando un gran anillo de escombros alrededor de la Tierra, que luego se acrecentó para formar la Luna. Esta colisión" +
                " también resultó en el eje inclinado de 23.5 ° de la Tierra, causando así las estaciones. Las proporciones isotópicas de " +
                "oxígeno de la Luna parecen ser esencialmente idénticas a las de la Tierra. Las proporciones isotópicas de oxígeno, que " +
                "pueden medirse con mucha precisión, producen una firma única y distinta para cada cuerpo del sistema solar. Si Tea hubiera " +
                "sido un protoplaneta separado, probablemente habría tenido una firma isotópica de oxígeno diferente de la proto-Tierra, al" +
                " igual que el material mixto expulsado. Además, la relación de isótopos de titanio de la Luna (50Ti/47Ti ) parece tan" +
                " cercana a la de la Tierra (dentro de 4 partes por millón) que poco o nada de la masa del cuerpo en colisión podría haber " +
                "sido parte de la Luna.";

    }

    private void setTitulo3(){
        this.titulo3 = "Formación";
    }

    private void setTerceraDesc(){
        this.terceraDesc = "Se han afirmado algunas teorías que presumen que la proto-Tierra no tuvo grandes lunas al comienzo de la " +
                "formación del Sistema Solar, hace 4.6 mil millones de años, la Tierra era básicamente roca y lava. Tea, un protoplaneta " +
                "temprano del tamaño de Marte, golpeó la Tierra de tal manera que expulsó una cantidad considerable de material lejos de la " +
                "Tierra. Una parte de estas eyecciones escapó al espacio, pero el resto se consolidó en un solo cuerpo esférico en órbita " +
                "alrededor de la Tierra, creando la Luna.\n" +
                "La hipótesis requiere una colisión entre una proto-Tierra de aproximadamente el 90% del tamaño de la" +
                " Tierra actual, y otro cuerpo del diámetro de Marte (la mitad del diámetro terrestre y una décima parte de su masa)." +
                " A esta última a veces se la conoce como Tea, el nombre de la madre de Selene, la diosa de la Luna en la mitología griega. " +
                "Esta relación de tamaño es necesaria para que el sistema resultante tenga un momento angular suficiente para que coincida con la" +
                " configuración orbital actual. Tal impacto habría puesto suficiente material en órbita alrededor de la Tierra para eventualmente" +
                " haberse acumulado para formar la Luna.\n";
    }

    private void setCuartaDesc(){
        this.cuartaDesc = "Las simulaciones por computadora muestran la necesidad de un golpe de mirada, lo que hace que una parte del colisionador forme " +
                "un largo brazo de material que luego se corta. La forma asimétrica de la Tierra después de la colisión hace que este material" +
                " se asiente en una órbita alrededor de la masa principal. La energía involucrada en esta colisión es impresionante: posiblemente" +
                " billones de toneladas de material se habrían vaporizado y derretido. En partes de la Tierra, la temperatura habría aumentado a " +
                "10 000 °C. \n" + "El núcleo de hierro relativamente pequeño de la Luna (en comparación con otros planetas rocosos y lunas en el " +
                "Sistema Solar) se explica por el núcleo de Theia que se fusiona principalmente con el de la Tierra. La falta de volátiles en las" +
                " muestras lunares también se explica en parte por la energía de la colisión. La energía liberada durante la reacreación de material " +
                "en órbita alrededor de la Tierra habría sido suficiente para derretir una gran parte de la Luna, lo que llevaría a la generación de un" +
                " océano de magma.\n" + "La Luna recién formada orbitaba aproximadamente a una décima parte de la distancia que lo hace hoy," +
                " y gira en espiral hacia afuera debido a la fricción de las mareas que transfiere el momento angular de las rotaciones de " +
                "ambos cuerpos al movimiento orbital de la Luna. A lo largo del camino, la rotación de la Luna se bloqueó en la Tierra, " +
                "por lo que un lado de la Luna se enfrenta continuamente hacia la Tierra. Además, la Luna habría chocado e incorporado" +
                " los pequeños satélites preexistentes de la Tierra, que habrían compartido la composición de la Tierra, incluidas las " +
                "abundancias isotópicas. La geología de la Luna desde entonces ha sido más independiente de la Tierra.\n" +
                 "Un estudio de 2012 sobre el agotamiento de los isótopos de zinc en la Luna apoyó el origen del gran impacto para la Tierra y la Luna." +
                "\n" +
                "En 2013, se publicó un estudio que indicaba que el agua en el magma lunar es indistinguible de la de las condritas carbonosas y casi " +
                "igual que la de la Tierra en la composición isotópica.\n" + "La hipótesis del gran impacto fue nuevamente cuestionada en septiembre de 2013," +
                " con la creciente sensación de que los orígenes lunares son más complicados.";

    }

    public String getDescripcion(){
        return this.descripcion;
    }
    public String getTituloDescrip(){
        return this.tituloDescrip;
    }

    public String getURL_LUNAFONDO() {
        return URL_LUNAFONDO;
    }
    public String getURL_PRINCIPAL() {
        return URL_PRINCIPAL;
    }

    public String getFECHA_ESTADO() {
        return FECHA_ESTADO;
    }
    public String getURL_DISTANCIA() {
        return URL_DISTANCIA;
    }

    public void asignarFoto(String url){
        this.urlImgLuna = url;
    }

    public String getUrlImgLuna(){
        return this.urlImgLuna;
    }

    public void asignarFecha(String fecha){
        this.fecha = fecha;
    }

    public String getFecha(){
        return this.fecha;
    }

    public void asignarTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void asignarEstado(String estado){
        this.estado = "Actualmente" + estado;
    }

    public String getEstado(){
        return this.estado;
    }

    public void asignarDistancia(String distancia){
        this.distanciaActual = "En este instante la luna se encuentra a " + distancia +
            " kilometros de la tierra";
    }

    public String getDistanciaActual(){
        return this.distanciaActual;
    }

    public String getTitulo2() {
        return titulo2;
    }

    public String getSegundaDesc() {
        return segundaDesc;
    }

    public String getTitulo3() {
        return titulo3;
    }

    public String getTerceraDesc() {
        return terceraDesc;
    }

    public String getCuartaDesc() {
        return cuartaDesc;
    }

    public String getAdicional() {
        return adicional;
    }


}
