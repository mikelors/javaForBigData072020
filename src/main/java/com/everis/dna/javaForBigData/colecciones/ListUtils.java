package com.everis.dna.javaForBigData.colecciones;

import java.util.*;

public class ListUtils {

    public static Integer obtenerMayorElemento(List<Integer> listaDeNumeros){
        Integer max = 0;
        for (int i = 0; i < listaDeNumeros.size(); i++) {
            Integer valorActual = listaDeNumeros.get(i);
            if (valorActual > max) {
                max = valorActual;
            }
        }
        return max;
    }

    public static Integer obtenerMayorElemento2(List<Integer> listaDeNumeros){
        Integer max = 0;
        for (Integer valorActual : listaDeNumeros) {
            if (valorActual > max){
                max = valorActual;
            }
        }
        return max;
    }

    public static Integer obtenerMedia (List<Integer> listaDeNumeros) {
        Integer acumulado = 0;
        for (Integer valorActual : listaDeNumeros) {
             acumulado += valorActual;
        }
        return acumulado/listaDeNumeros.size();
    }

    public static Integer obtenerSumatorio (List<Integer> listaDeNumeros) { return null;}

    public static boolean existeElemento (List<Integer> listaDeNumeros, Integer elemento) {

//        for (Integer valorActual : listaDeNumeros) {
//            if (valorActual.equals(elemento))
//                return true;
//        }
//        return false;
        return listaDeNumeros.contains(elemento);
    }

    public static Integer obtenerTamanyoLista (List<Integer> listaDeNumeros) {
        return listaDeNumeros.size();
    }

    public static Integer obtenerNumeroApariciones (List<Integer> listaDeNumeros, Integer elemento) { return 0;}

    public static Integer obtenerMediaDeNumerosEnPosicionesPares (List<Integer> listaDeNumeros) {return 0;}

//    public static List<Integer> obtenerListaOrdenada(List<Integer> listaDeNumeros) {
//        Collections.sort(
//                listaDeNumeros,
//                new Comparator<Integer>() {
//                    @Override
//                    public int compare(Integer o1, Integer o2) {
//                    return o1.compareTo(o2);
//                    }
//                }
//        );
//        return listaDeNumeros;
//    }

    public static List<Integer> obtenerListaOrdenada(List<Integer> listaDeNumeros) {
        Collections.sort(
                listaDeNumeros,
                (a,b) -> a.compareTo(b)
        );
        return listaDeNumeros;
    }
}
