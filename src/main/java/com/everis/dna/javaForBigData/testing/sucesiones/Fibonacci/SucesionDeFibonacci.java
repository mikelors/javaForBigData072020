package com.everis.dna.javaForBigData.testing.sucesiones.Fibonacci;

import com.everis.dna.javaForBigData.testing.sucesiones.Excepciones.ElementoNoExisteException;
import com.everis.dna.javaForBigData.testing.sucesiones.Excepciones.SucesionDemasiadoPequenyaException;
import com.everis.dna.javaForBigData.testing.sucesiones.Sucesion;

import java.util.ArrayList;
import java.util.List;

public class SucesionDeFibonacci implements Sucesion {

    List<Integer> sucesion = new ArrayList<>();

    public void inicializarSucesion(int numeroDeElementos) throws SucesionDemasiadoPequenyaException {
        if (numeroDeElementos<2) {
            throw new SucesionDemasiadoPequenyaException("La sucesión de Fibonacci ha de tener al menos 2 elementos");
        }
        sucesion = new ArrayList<>();
        sucesion.add(0);
        sucesion.add(1);
        for (int i=2;i<numeroDeElementos; i++) {
            sucesion.add(sucesion.get(i-2) + sucesion.get(i-1));
        }
    }

    public Integer getElemento (int posicion) throws ElementoNoExisteException {
        if (posicion>=sucesion.size()) {
            throw new ElementoNoExisteException("La sucesión sólo tiene " + sucesion.size() + "elementos. No existe el elemento " + posicion);
        }
        return sucesion.get(posicion);
    }

    public Integer sumatorioSucesion(){
        Integer suma = 0;
        for (Integer valorActual:sucesion) {
            suma += valorActual;
        }
        return suma;
    }

    public Float mediaDeLaSucesion(){
        float media = (float)sumatorioSucesion() / (float)sucesion.size();
        return new Float(media);
    }

    public List<Integer> valoresDeLaSucesion(){
        return sucesion;
    }
}
