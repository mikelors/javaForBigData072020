package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo4.solucion;


import com.everis.dna.javaForBigData.principiosDisenyo.ejemplo4.solucion.emisores.Emisor;

public class GestorClimatologico {
    String condicionesActuales;
    Emisor emisorLluvia;
    Emisor emisorSol;

    public GestorClimatologico(Emisor emisorLluvia, Emisor emisorSol) {
        this.emisorLluvia = emisorLluvia;
        this.emisorSol = emisorSol;
    }

    public void setCondicionesActuales(String weatherDescription) {
        this.condicionesActuales = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = emisorLluvia.generarAlertaClimatologica(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emisorSol.generarAlertaClimatologica(weatherDescription);
            System.out.print(alert);
        }
    }
}
