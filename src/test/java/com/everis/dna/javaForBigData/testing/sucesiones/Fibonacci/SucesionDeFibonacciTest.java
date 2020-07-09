package com.everis.dna.javaForBigData.testing.sucesiones.Fibonacci;

import com.everis.dna.javaForBigData.testing.sucesiones.Excepciones.ElementoNoExisteException;
import com.everis.dna.javaForBigData.testing.sucesiones.Excepciones.SucesionDemasiadoPequenyaException;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;

public class SucesionDeFibonacciTest {
    @Test
    public void enLaPosicion3DeUnaSucesionDe5ElementosHayUn2() throws Exception {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        sucesionDeFibonacci.inicializarSucesion(5);

        int valorObtenido = sucesionDeFibonacci.getElemento(3);

        assertEquals(2, valorObtenido);
    }

    @Test
    public void enLaPosicion10DeUnaSucesionDe12ElementosHayUn55() throws Exception {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        sucesionDeFibonacci.inicializarSucesion(12);

        int valorObtenido = sucesionDeFibonacci.getElemento(10);

        assertEquals(55, valorObtenido);
    }

    @Test
    public void enLaPosicion0DeUnaSucesionDe2ElementosHayUn0() throws Exception {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        sucesionDeFibonacci.inicializarSucesion(2);

        int valorObtenido = sucesionDeFibonacci.getElemento(0);

        assertEquals(0, valorObtenido);
    }

    @Test (expected= ElementoNoExisteException.class)
    public void enLaPosicion5DeUnaSucesionDe3SaltaExcepcion() throws Exception {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        sucesionDeFibonacci.inicializarSucesion(3);

        int valorObtenido = sucesionDeFibonacci.getElemento(5);

        fail();
    }

    @Test (expected= SucesionDemasiadoPequenyaException.class)
    public void crearUnFibonacciDeTamanyo0GeneraExcepcion() throws Exception {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();

        sucesionDeFibonacci.inicializarSucesion(0);

        fail();
    }

    @Test
    public void sumatorioDeSerieCon10ElementosDa88() throws Exception {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        sucesionDeFibonacci.inicializarSucesion(10);

        int valorObtenido = sucesionDeFibonacci.sumatorioSucesion();

        assertEquals(88, valorObtenido);
    }

    @Test
    public void mediaDeSerieCon10ElementosDa8con8() throws Exception {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        sucesionDeFibonacci.inicializarSucesion(10);

        Float valorObtenido = sucesionDeFibonacci.mediaDeLaSucesion();

        assertEquals(new Float(8.8), valorObtenido);
    }

//    @Test
//    public void valoresDeLaSucesionReturnsListWithCorrectSize() throws Exception{
//        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
//        sucesionDeFibonacci.inicializarSucesion(10);
//
//        List<Integer> valoresDeLaSucesion = sucesionDeFibonacci.valoresDeLaSucesion();
//
//        assertThat( valoresDeLaSucesion, hasSize(10));
//    }



    @Test
    public void valoresDeLaSucesionReturnsListWithCorrectSize2() throws Exception{
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        sucesionDeFibonacci.inicializarSucesion(10);

        List<Integer> valoresDeLaSucesion = sucesionDeFibonacci.valoresDeLaSucesion();

        assertThat( valoresDeLaSucesion, hasItems(0, 1, 8));
    }
}