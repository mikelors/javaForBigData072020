package com.everis.dna.javaForBigData.testing.sucesiones;

public class OperadorDeSucesiones {

    public static boolean mismoValor(Sucesion primeraSucesion, Sucesion segundaSucesion) {
        if (!(primeraSucesion.sumatorioSucesion().equals(segundaSucesion.sumatorioSucesion()))) {
            return false;
        }
        if (!(primeraSucesion.mediaDeLaSucesion().equals(segundaSucesion.mediaDeLaSucesion()))) {
            return false;
        }
        return true;
    }
}
