package com.everis.dna.javaForBigData.strings;

public class StringUtils {

    public static int contarApariciones (String cadena, char caracter){
        int apariciones = 0;
        for (int i=0; i<cadena.length(); i++){
            if (cadena.charAt(i) == caracter){
                apariciones++;
            }
        }

        return apariciones;
    }

    public static boolean esPalindroma (String cadena) {
        return false;
    }
}
