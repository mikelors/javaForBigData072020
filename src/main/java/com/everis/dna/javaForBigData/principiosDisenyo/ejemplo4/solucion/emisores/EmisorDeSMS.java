package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo4.solucion.emisores;

public class EmisorDeSMS implements Emisor {
    public String generarAlertaClimatologica(String condicionesClimatologicas) {
        String alerta = "Condiciones climatológicas para envío telefónico: " + condicionesClimatologicas;

        //Aquí iría el envío de la alerta por SMS
        //...

        return alerta;
    }
}
