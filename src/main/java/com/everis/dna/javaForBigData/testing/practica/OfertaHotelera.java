package com.everis.dna.javaForBigData.testing.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class OfertaHotelera {

    private List<Hotel> hoteles;

    /*
     * Constructor que inicializa la clase a partir de la lista de Hoteles recibida como parámetro
     * */
    public OfertaHotelera(List<Hotel> hoteles) {
        this.hoteles = new ArrayList<>(hoteles);
    }

    /*
     * Devuelve todos los hoteles almacenados en una única colección de tipo List.
     * En caso de no haber hoteles deberá devolver una colección vacía.
     * */
    public List<Hotel> obtenerHoteles () {
        return null;
    }

    /**
     * Obtiene un Mapa de los hoteles teniendo como clave la Provincia
     */
    public Map<Provincia, List<Hotel>> obtenerHotelesPorProvincia() {
        return null;
    }

    /*
     * Obtiene una única colección de tipo List con los hoteles pertenecientes a una Ciudad dada
     * En caso de no existir ningún hotel para la ciudad dada, deberá devolver una lista vacía.
     * */
    public List<Hotel> obtenerHotelesDeUnaCiudad(Ciudad ciudad) {
        return null;
    }

    /*
     * Obtiene un único Hotel por su Id
     * En caso de no existir el Id, deberá devolver una Excepción NoSuchElementException
     *   con el mensaje "Id de Hotel no válido"
     * */
    public Hotel obtenerHotelPorId (Integer id) {

        return null;
    }

    /*
     * Permite añadir un hotel a la colección
     * */
    public void anyadirHotel(Hotel hotel){

    }

}
