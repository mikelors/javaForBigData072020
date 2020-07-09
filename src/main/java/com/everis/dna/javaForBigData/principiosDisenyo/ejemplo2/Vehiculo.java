package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo2;


public class Vehiculo {

    private Marcha marcha;

    public Marcha getMarcha() {
        return marcha;
    }

    public void cambiarDeMarcha(final Marcha marcha) {
        this.marcha = marcha;
    }

}