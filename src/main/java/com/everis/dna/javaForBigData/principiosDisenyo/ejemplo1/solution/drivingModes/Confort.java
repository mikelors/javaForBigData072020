package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1.solution.drivingModes;

public class Confort implements DrivingMode {
    @Override
    public int getPower() {
        return 400;
    }

    @Override
    public int getSuspensionHeight() {
        return 20;
    }
}
