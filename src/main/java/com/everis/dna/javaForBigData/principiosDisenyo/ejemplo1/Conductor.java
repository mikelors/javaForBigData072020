package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1;

import static com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1.DrivingMode.SPORT;

/**
 * Created by bsferreira on 16-04-2016.
 */
public class Conductor {

    private Vehicle vehicle;

    public Conductor(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode){
        switch (drivingMode){
            case SPORT:
                vehicle.setPower(500);
                vehicle.setSuspensionHeight(10);
                break;
            case COMFORT:
                vehicle.setPower(400);
                vehicle.setSuspensionHeight(20);
                break;
            default:
                vehicle.setPower(400);
                vehicle.setSuspensionHeight(20);
                break;
            // when we need to add another mode (e.g. ECONOMY) 2 classes will change DrivingMode and Conductor.
        }
    }

}
