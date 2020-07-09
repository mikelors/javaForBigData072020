package com.everis.dna.javaForBigData.bucles;

public class Bucles {

    public static void main(String args[]){

        System.out.println("1 - Sucesiones aritméticas");
        System.out.println("-----------------------------");

        escribirSucesionAritmetica(2, 11, 1);
        escribirSucesionAritmetica(2,19,2);
        escribirSucesionAritmetica(5,32, 3);
        escribirSucesionAritmetica(0,25,5);

        System.out.println("4 - Sumatorio y Factorial");
        System.out.println("-----------------------------");

        System.out.println("Sumatorio de 5: " + sumatorio(5));
        System.out.println("Factorial de 5: " + factorial(5));

    }

    private static void escribirSucesionAritmetica(int limiteInferior, int limiteSuperior, int incremento) {
        for (int i=limiteInferior; i<=limiteSuperior; i+=incremento){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int sumatorio(int valor){
        int resultado = 0;
        for(int i = 1; i<=valor; i++){
            resultado+=i;
        }
        return resultado;
    }

    public static int factorial(int valor){
        int resultado = 1;
        for(int i = 1; i<=valor; i++){
            resultado*=i;
        }
        return resultado;
    }

    public static boolean esPrimo(int valor){
        for(int i=2; i < valor/2; i++){
            if (valor%i == 0)
                return false;
        }
        return true;
    }
}
