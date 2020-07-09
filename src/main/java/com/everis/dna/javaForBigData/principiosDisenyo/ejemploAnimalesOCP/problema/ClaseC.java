package com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.problema;

import com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.problema.animales.Animal;
import com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.problema.animales.AnimalType;

public class ClaseC {

    public static void main(){
        Animal miAnimal = new Animal(AnimalType.PERRO);
        miAnimal.dibujar();
    }
}
