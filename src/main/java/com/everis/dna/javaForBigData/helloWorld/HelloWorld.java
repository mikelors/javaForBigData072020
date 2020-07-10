package com.everis.dna.javaForBigData.helloWorld;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String args[]){
        List<String> stringList = new ArrayList<>();
        stringList.add("ddd2");
        stringList.add("aaa2");
        stringList.add("bbb1");
        stringList.add("aaa1");
        stringList.add("bbb3");
        stringList.add("ccc");
        stringList.add("bbb2");
        stringList.add("ddd1");

        String losQueEmpiezanPorBOrdenadosYEnMayusculas =
            stringList
                    .stream()
                    .map((s) -> s.toUpperCase())
                    .filter((s) -> s.startsWith("B"))
                    .sorted((a,b) -> a.compareTo(b))
                    .reduce((a,b)-> a + " - " + b)
                    .get();

        System.out.println(losQueEmpiezanPorBOrdenadosYEnMayusculas);


        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(8);
        listaNumeros.add(1);
        listaNumeros.add(82);
        listaNumeros.add(8);
        listaNumeros.add(18);
        listaNumeros.add(6);
        listaNumeros.add(4);
        listaNumeros.add(3);
        listaNumeros.add(8);
        listaNumeros.add(1);
        listaNumeros.add(7);
        listaNumeros.add(8);
        listaNumeros.add(19);

        Integer max = listaNumeros
                .stream()
                .reduce((a,b) -> (a > b)? a:b)
                .get();

        System.out.println(max);

    }














}
