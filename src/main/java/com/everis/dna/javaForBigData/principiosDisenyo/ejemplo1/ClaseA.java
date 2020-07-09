package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1;

public class ClaseA {

    public static void main(){
        Vehicle vehicle = new Vehicle();
        Conductor conductor = new Conductor(vehicle);
        conductor.changeDrivingMode(DrivingMode.COMFORT);
        conductor.changeDrivingMode(DrivingMode.SPORT);
    }
}
