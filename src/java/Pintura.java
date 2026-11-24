package java;

import java.time.LocalDate;

public class Pintura extends Obra{
    private String material;
    private String forma;

    //Constructor
    public Pintura(String nombre, LocalDate fechaCreacion, String creador, String ciudadOrigen, String material, String forma) {
        super(nombre, fechaCreacion, creador, ciudadOrigen);
        this.material = material;
        this.forma = forma;
    }

    //Metodos Getter:
    public String getMaterial() {
        return material;
    }
    public String getForma() {
        return forma;
    }



}
