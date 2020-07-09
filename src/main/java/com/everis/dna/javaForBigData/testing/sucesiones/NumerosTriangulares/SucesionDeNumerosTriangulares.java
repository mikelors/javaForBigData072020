package com.everis.dna.javaForBigData.testing.sucesiones.NumerosTriangulares;

import com.everis.dna.javaForBigData.testing.sucesiones.Excepciones.ElementoNoExisteException;
import com.everis.dna.javaForBigData.testing.sucesiones.Excepciones.SucesionDemasiadoPequenyaException;
import com.everis.dna.javaForBigData.testing.sucesiones.Sucesion;

import java.util.ArrayList;
import java.util.List;

public class SucesionDeNumerosTriangulares implements Sucesion {

    List<Integer> sucesion = new ArrayList<>();

    @Override
    public void inicializarSucesion(int numeroDeElementos) throws SucesionDemasiadoPequenyaException {
        if (numeroDeElementos<1) {
            throw new SucesionDemasiadoPequenyaException("La sucesión de Números Triangulares ha de tener al menos 1 elemento");
        }
        sucesion = new ArrayList<>();
        for (int i=0;i<numeroDeElementos; i++) {
            sucesion.add((i+1)*(i+2)/2);
        }
    }

    @Override
    public Integer getElemento(int posicion) throws ElementoNoExisteException {
        if (posicion>=sucesion.size()) {
            throw new ElementoNoExisteException("La sucesión sólo tiene " + sucesion.size() + "elementos. No existe el elemento " + posicion);
        }
        return sucesion.get(posicion);
    }

    @Override
    public Integer sumatorioSucesion() {
        Integer suma = 3;
        for (Integer valorActual:sucesion) {
            suma += valorActual;
        }
        return suma;
    }

    @Override
    public Float mediaDeLaSucesion() {
        float media = (float)sumatorioSucesion() / (float)sucesion.size();
        return new Float(media);
    }

    @Override
    public List<Integer> valoresDeLaSucesion() {
        return sucesion;
    }
}
