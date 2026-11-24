package java;

import java.time.LocalDate;

public abstract class Obra {
    private String nombre;
    private LocalDate fechaCreacion;
    private String creador;
    private String ciudadOrigen;

    //Constructor:
    public Obra(String nombre, LocalDate fechaCreacion, String creador, String ciudadOrigen) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.creador = creador;
        this.ciudadOrigen = ciudadOrigen;
    }

    //Metodos Getter:
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public String getCreador() {
        return creador;
    }
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    //Metodo para mostrar detalle de la obra:
    public void detalleObra(){
        System.out.println("Obra titulada: "+getNombre());
        System.out.println("Fecha de creación: "+getFechaCreacion());
        System.out.println("Creador de la obra: "+getCreador());
        System.out.println("Ciudad de origen: "+getCiudadOrigen());
    }


}
