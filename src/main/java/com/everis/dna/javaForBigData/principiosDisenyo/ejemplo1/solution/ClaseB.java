package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1.solution;


import com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1.solution.drivingModes.Confort;
import com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1.solution.drivingModes.DrivingMode;
import com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1.solution.drivingModes.Economy;

public class ClaseB {

    public static void main(){
        Vehicle vehicle = new Vehicle();
        Conductor conductor = new Conductor(vehicle);

        DrivingMode confort = new Economy();

        conductor.changeDrivingMode(confort);
    }
}
