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

    //Sobreescritura del metodo heredado
    @Override
    public void detalleObra(){
        super.detalleObra();
        System.out.println("Material de la escultura: "+getMaterial());
        System.out.println("Tecnica de la escultura: " +getTecnica());
    }


}
