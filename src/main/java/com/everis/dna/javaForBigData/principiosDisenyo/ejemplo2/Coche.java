package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo2;


public class Coche extends Vehiculo {

    //Un coche no puede poner la marcha atrás mientras avanza.
    @Override
    public void cambiarDeMarcha(Marcha marcha) {
        if(Marcha.R.equals(marcha) && getMarcha().equals(Marcha.D)){
            throw new RuntimeException("No se puede meter MARCHA ATRÁS mientras la marcha"
                    + getMarcha().toString() + " está metida!");
        }
    }
}
