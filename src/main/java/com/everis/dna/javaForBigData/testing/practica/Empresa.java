package com.everis.dna.javaForBigData.testing.practica;

public class Empresa {

    private String nombre;
    private int id;
    private static Integer idGenerator  = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.id = idGenerator++;
    }
}
