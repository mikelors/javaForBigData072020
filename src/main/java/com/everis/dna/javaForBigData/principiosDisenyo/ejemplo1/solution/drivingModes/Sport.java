package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo1.solution.drivingModes;

public class Sport implements DrivingMode {
    @Override
    public int getPower() {
        return 500;
    }

    @Override
    public int getSuspensionHeight() {
        return 10;
    }
}
