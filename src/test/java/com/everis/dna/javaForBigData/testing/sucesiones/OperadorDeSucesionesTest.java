package com.everis.dna.javaForBigData.testing.sucesiones;

import com.everis.dna.javaForBigData.testing.sucesiones.Excepciones.SucesionDemasiadoPequenyaException;
import com.everis.dna.javaForBigData.testing.sucesiones.Fibonacci.SucesionDeFibonacci;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class OperadorDeSucesionesTest {

    @Test
    public void test1() throws SucesionDemasiadoPequenyaException {
        SucesionDeFibonacci sucesionDeFibonacci1 = new SucesionDeFibonacci();
        sucesionDeFibonacci1.inicializarSucesion(9);
        SucesionDeFibonacci sucesionDeFibonacci2 = new SucesionDeFibonacci();
        sucesionDeFibonacci2.inicializarSucesion(13);

        boolean resultado = OperadorDeSucesiones.mismoValor(sucesionDeFibonacci1, sucesionDeFibonacci2);

        assertEquals(resultado, false);

    }

    @Test
    public void dosSucesionesConMismoSumatorioYDistintaMediaDevuelveFalso() {

        Sucesion sucesion1 = Mockito.mock(Sucesion.class);
        Sucesion sucesion2 = Mockito.mock(Sucesion.class);
        when(sucesion1.mediaDeLaSucesion()).thenReturn(new Float(1176));
        when(sucesion2.mediaDeLaSucesion()).thenReturn(new Float(174));
        when(sucesion1.sumatorioSucesion()).thenReturn(new Integer(27));
        when(sucesion2.sumatorioSucesion()).thenReturn(new Integer(27));

        boolean resultado = OperadorDeSucesiones.mismoValor(sucesion1, sucesion2);

        assertEquals(resultado, false);
    }

}