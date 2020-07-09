package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo4.original.emisores;

public class EmisorDeSMS {
    public String generarAlertaClimatologica(String condicionesClimatologicas) {
        String alerta = "Condiciones climatológicas para envío telefónico: " + condicionesClimatologicas;

        //Aquí iría el envío de la alerta por SMS
        //...

        return alerta;
    }
}
