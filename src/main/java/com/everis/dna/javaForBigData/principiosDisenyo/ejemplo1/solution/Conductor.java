package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1.solution;


import com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1.solution.drivingModes.DrivingMode;

/**
 * Created by bsferreira on 16-04-2016.
 */
public class Conductor {

    private Vehicle vehicle;

    public Conductor(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode){
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());
    }

}
