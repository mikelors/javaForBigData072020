package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1.solution;


import com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1.solution.drivingModes.Confort;
import com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1.solution.drivingModes.DrivingMode;

public class ClaseA {

    public static void main(){
        Vehicle vehicle = new Vehicle();
        Conductor conductor = new Conductor(vehicle);

        DrivingMode confort = new Confort();

        conductor.changeDrivingMode(confort);
    }
}
