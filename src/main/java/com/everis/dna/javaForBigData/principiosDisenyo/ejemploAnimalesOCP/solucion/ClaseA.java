package com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.solucion;


import com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.solucion.animales.Animal;
import com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.solucion.animales.Elefante;

public class ClaseA {

    public static void main(){
        Animal animal = new Elefante();
        animal.dibujar();
    }
}
