package com.everis.dna.javaForBigData.principiosDisenyo.ejemplo4.solucion;

import com.everis.dna.javaForBigData.principiosDisenyo.ejemplo4.solucion.emisores.Emisor;
import com.everis.dna.javaForBigData.principiosDisenyo.ejemplo4.solucion.emisores.EmisorDeEmails;
import com.everis.dna.javaForBigData.principiosDisenyo.ejemplo4.solucion.emisores.EmisorDeSMS;

public class ClaseA {

    public static void main(){
        Emisor telefono = new EmisorDeSMS();
        Emisor emails = new EmisorDeEmails();
        GestorClimatologico gestorClimatologico = new GestorClimatologico(telefono, emails);
    }
}
