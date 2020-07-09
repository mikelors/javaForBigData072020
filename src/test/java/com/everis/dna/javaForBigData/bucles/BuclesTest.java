package com.everis.dna.javaForBigData.bucles;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuclesTest {

    @Test
    public void sumatorioDe5TieneQueDar15(){
        int resultado = Bucles.sumatorio(5);
        assertEquals(resultado, 15);
    }

    @Test
    public void sumatorioDe0TieneQueDar0(){
        int resultado = Bucles.sumatorio(0);
        assertEquals(resultado, 0);
    }

    @Test
    public void sumatorioDe1TieneQueDar1(){
        int resultado = Bucles.sumatorio(1);
        assertEquals(resultado, 1);
    }

    @Test
    public void elNumero5EsPrimo(){
        assertEquals(Bucles.esPrimo(5), true);
    }

    @Test
    public void elNumero6NoEsPrimo(){
        assertEquals(Bucles.esPrimo(6), false);
    }

    @Test
    public void elNumero17EsPrimo(){
        assertEquals(Bucles.esPrimo(17), true);
    }

    @Test
    public void elNumero1EsPrimo(){
        assertEquals(Bucles.esPrimo(1), true);
    }

    @Test
    public void elNumero7EsPrimo(){
        assertEquals(Bucles.esPrimo(7), true);
    }

}