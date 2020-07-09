package com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.problema;

import com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.problema.animales.Animal;
import com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.problema.animales.AnimalType;

public class ClaseB {

    public static void main(){
        Animal miAnimal = new Animal(AnimalType.PUMA);
        miAnimal.dibujar();
    }
}
