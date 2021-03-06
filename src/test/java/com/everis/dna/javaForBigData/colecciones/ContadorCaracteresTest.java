package com.everis.dna.javaForBigData.colecciones;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContadorCaracteresTest {

    @Test
    public void DevuelveCorrectamenteElNumeroDeAparicionesDeCiertoCaracter(){
        ContadorCaracteres contadorCaracteres = new ContadorCaracteres("En un lugar de la Mancha de cuyo nombre no quiero acordarme");

        assertEquals(contadorCaracteres.obtenerNumeroDeApariciones('e'),5);
    }

//    @Test
//    public void DevuelveCorrectamenteElCaracterConMasApariciones(){
//        ContadorCaracteres contadorCaracteres = new ContadorCaracteres("En un lugar de la Mancha de cuyo nombre no quiero acordarme");
//        Character character = ' ';
//
//        assertEquals(contadorCaracteres.obtenerCaracterConMasApariciones(),character);
//    }
}