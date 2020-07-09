package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo4.original;

import com.everis.dna.javaForBigData.principiosDisenyo.ejemplo4.solucion.emisores.EmisorDeEmails;
import com.everis.dna.javaForBigData.principiosDisenyo.ejemplo4.solucion.emisores.EmisorDeSMS;

public class GestorClimatologico {
    String condicionesActuales;
    EmisorDeSMS telefono;
    EmisorDeEmails emisorDeEmails;

    public GestorClimatologico() {
        telefono = new EmisorDeSMS();
        emisorDeEmails = new EmisorDeEmails();
    }

    public void setCondicionesActuales(String weatherDescription) {
        this.condicionesActuales = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = telefono.generarAlertaClimatologica(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emisorDeEmails.generarAlertaClimatologica(weatherDescription);
            System.out.print(alert);
        }
    }
}
