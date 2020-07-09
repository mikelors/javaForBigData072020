package com.everis.dna.javaForBigData.testing.practica;

public class Ciudad {

    private Integer id;
    private Integer longitud;
    private Integer latitud;
    private String nombre;
    private Provincia provincia;
    private static Integer idGenerator  = 0;

    public Integer getId() {
        return id;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Integer getLatitud() {
        return latitud;
    }

    public void setLatitud(Integer latitud) {
        this.latitud = latitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Ciudad(Integer longitud, Integer latitud, String nombre, Provincia provincia) {
        this.id = idGenerator++;
        this.longitud = longitud;
        this.latitud = latitud;
        this.nombre = nombre;
        this.provincia = provincia;
    }
}
