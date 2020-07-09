package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo3;
/**
 * Created by bsferreira on 10-04-2016.
 */
public class Coche extends Vehiculo {

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }

    @Override
    public void encenderRadio() {
        radioOn = true;
    }

    @Override
    public void apagarRadio() {
        radioOn = false;
    }

    @Override
    public void encenderCamara() {
        // nada que hacer aquí
    }

    @Override
    public void apagarCamara() {
        // nada que hacer aquí
    }
}