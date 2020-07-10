package com.everis.dna.javaForBigData.testing.practica;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class OfertaHoteleraTest {

    @Test
    public void obtenerHotelPorIDDevulveHotelCorrecto () {
        Hotel hotel1 = Mockito.mock(Hotel.class);
        when(hotel1.getId()).thenReturn(1);
        List<Hotel> listaHoteles = new ArrayList<>();
        listaHoteles.add(hotel1);
        OfertaHotelera gestorOferta = new OfertaHotelera(listaHoteles);

        Hotel hotelObtenido = gestorOferta.obtenerHotelPorId(1);

        assertEquals(hotelObtenido, hotel1);
    }

}