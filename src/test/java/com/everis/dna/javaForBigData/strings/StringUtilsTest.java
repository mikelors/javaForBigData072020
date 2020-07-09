package com.everis.dna.javaForBigData.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void contarAparicionesDeAenFranciaDevuelve2 () {
        String francia = "Francia";
        char caracterA = 'a';

        int apariciones = StringUtils.contarApariciones(francia, caracterA);

        assertEquals(apariciones, 2);
    }

    @Test
    public void contarAparicionesDeOenFranciaDevuelve0 () {
        String francia = "Francia";
        char caracterA = 'o';

        int apariciones = StringUtils.contarApariciones(francia, caracterA);

        assertEquals(apariciones, 0);
    }


    @Test
    public void contarAparicionesDeAenDinamarcaDevuelve3 () {
        String francia = "Dinamarca";
        char caracterA = 'a';

        int apariciones = StringUtils.contarApariciones(francia, caracterA);

        assertEquals(apariciones, 3);
    }

}