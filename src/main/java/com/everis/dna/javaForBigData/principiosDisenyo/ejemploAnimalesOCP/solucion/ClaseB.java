package com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.solucion;

import com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.solucion.animales.Animal;
import com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.solucion.animales.Puma;

public class ClaseB {

    public static void main(){
        Animal animal = new Puma();
        animal.dibujar();
    }
}
