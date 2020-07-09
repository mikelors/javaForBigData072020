package com.everis.dna.javaForBigData.principiosDisenyo.ejemploAnimalesOCP.problema.animales;

public class Animal {

    AnimalType animalType;

    public Animal(AnimalType animalType) {
        this.animalType = animalType;
    }

    public void dibujar() {
        switch (animalType) {
            case ELEFANTE:
                dibujarElefante();
                break;
            case PUMA:
                dibujarPuma();
                break;
            //MODIFICACION:
            case PERRO:
                dibujarPerro();
                break;
        }
    }

    //MODIFICACION:
    private void dibujarPerro() {
    }

    public void dibujarElefante(){
        //...
    }
    public void dibujarPuma(){
        //...
    }

}
