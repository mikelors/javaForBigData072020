package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo4.solucion.emisores;

public class EmisorDeEmails implements Emisor{
    public String generarAlertaClimatologica(String condicionesClimatologicas) {
        String alerta = "Condiciones climatológicas para envío por EMAIL: " + condicionesClimatologicas;

        //Aquí iría el envío de la alerta por EMAIL
        //...

        return alerta;
    }
}
