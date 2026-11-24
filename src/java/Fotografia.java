package java;

import java.time.LocalDate;

public class Fotografia extends Obra{
    private String tipo; /*retrato, paisaje, conceptual, etc*/
    private String orientacion;

    //Constructor:
    public Fotografia(String nombre, LocalDate fechaCreacion, String creador, String ciudadOrigen, String tipo, String orientacion) {
        super(nombre, fechaCreacion, creador, ciudadOrigen);
        this.tipo = tipo;
        this.orientacion = orientacion;
    }

    //Metodos getter:
    public String getTipo() {
        return tipo;
    }
    public String getOrientacion() {
        return orientacion;
    }




}
