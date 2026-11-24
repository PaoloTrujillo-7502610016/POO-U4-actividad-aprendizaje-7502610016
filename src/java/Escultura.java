package java;

import java.time.LocalDate;

public class Escultura extends Obra{
    private String material;
    private String tecnica;

    //Constructor
    public Escultura(String nombre, LocalDate fechaCreacion, String creador, String ciudadOrigen, String material, String tecnica) {
        super(nombre, fechaCreacion, creador, ciudadOrigen);
        this.material = material;
        this.tecnica = tecnica;
    }

    //Metodos getter:
    public String getMaterial() {
        return material;
    }
    public String getTecnica() {
        return tecnica;
    }



}
