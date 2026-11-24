package java;

import java.util.ArrayList;
import java.util.List;

public class Museo {
    private String nombre;
    private String ciudad;
    private List<Sede> sedes = new ArrayList<>(); //Asociacion de 1 a muchos con Sede

    public Museo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarSede(Sede sede) { //Referencia de la asociacion de 1 a muchos con Sede
        sedes.add(sede);
    }

}
