package com.everis.dna.javaForBigData.colecciones;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ListUtilsTest {

    List lista;

    @Before
    public void before() {
        lista.add(8);
        lista.add(1);
        lista.add(82);
        lista.add(8);
        lista.add(18);
        lista.add(6);
        lista.add(4);
        lista.add(3);
        lista.add(8);
        lista.add(1);
        lista.add(7);
        lista.add(8);
        lista.add(19);
    }

    @Test
    public void obtenerMayorDevuelveElValorMayor() {
        Integer valorEsperado = 82;

        Integer valorObtenido = ListUtils.obtenerMayorElemento(lista);

        assertEquals(valorObtenido,valorEsperado);
    }

}