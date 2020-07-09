package com.everis.dna.javaForBigData.testing.practica;

public class Hotel {

    private Integer id;
    private static Integer idGenerator = 0;
    private Ciudad ciudad;
    private Empresa empresa;
    private String direccion;
    private Integer estrellas;

    public Hotel(Ciudad ciudad, Empresa empresa, String direccion, Integer estrellas) {
        this.ciudad = ciudad;
        this.empresa = empresa;
        this.direccion = direccion;
        this.estrellas = estrellas;
        this.id = idGenerator++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Integer estrellas) {
        this.estrellas = estrellas;
    }
}
