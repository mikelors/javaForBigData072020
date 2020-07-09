package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo3;


/**
 * Created by bsferreira on 10-04-2016.
 */
public abstract class Vehiculo implements Interruptores {

    private boolean engineRunning;

    public boolean isEngineRunning() {
        return engineRunning;
    }

    @Override
    public void arrancar() {
        engineRunning = true;
    }

    @Override
    public void apagar() {
        engineRunning = false;
    }

}