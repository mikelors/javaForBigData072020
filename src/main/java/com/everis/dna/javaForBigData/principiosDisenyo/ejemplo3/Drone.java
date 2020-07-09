package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo3;
/**
 * Created by bsferreira on 10-04-2016.
 */
public class Drone extends Vehiculo {

    private boolean cameraOn;

    public boolean isCameraOn() {
        return cameraOn;
    }

    @Override
    public void encenderCamara() {
        cameraOn = true;
    }

    @Override
    public void apagarCamara() {
        cameraOn = false;
    }

    @Override
    public void encenderRadio() {
        // nada que hacer aquí
    }

    @Override
    public void apagarRadio() {
        // nada que hacer aquí
    }
}