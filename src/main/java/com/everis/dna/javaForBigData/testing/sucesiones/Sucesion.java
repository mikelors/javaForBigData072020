package com.everis.dna.javaForBigData.testing.sucesiones;

import com.everis.dna.javaForBigData.testing.sucesiones.Excepciones.ElementoNoExisteException;
import com.everis.dna.javaForBigData.testing.sucesiones.Excepciones.SucesionDemasiadoPequenyaException;

import java.util.List;

public interface Sucesion {

    public void inicializarSucesion(int numeroDeElementos) throws SucesionDemasiadoPequenyaException;

    public Integer getElemento(int posicion) throws ElementoNoExisteException;

    public Integer sumatorioSucesion();

    public Float mediaDeLaSucesion();

    public List<Integer> valoresDeLaSucesion();

}
