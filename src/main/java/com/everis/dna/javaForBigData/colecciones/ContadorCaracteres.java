package com.everis.dna.javaForBigData.colecciones;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ContadorCaracteres {

    Map<Character, Integer> mapaDeCaracteres;


    public ContadorCaracteres(String cadena) {
        mapaDeCaracteres = new HashMap<>();
        for (int i = 0; i < cadena.length(); i++) {
            Character caracterActual = cadena.charAt(i);
            if (mapaDeCaracteres.containsKey(caracterActual)) {
                Integer contadorActual = mapaDeCaracteres.get(caracterActual);
                mapaDeCaracteres.put(caracterActual, contadorActual + 1);
            } else {
                mapaDeCaracteres.put(caracterActual, 1);
            }
        }
    }

    public int obtenerNumeroDeApariciones (char caracter) {
        return mapaDeCaracteres.get(caracter);
    }

//    public Character obtenerCaracterConMasApariciones() {
//
//        Collections.sort(mapaDeCaracteres, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                return b.compareTo(a);
//            }
//
//    });
}
