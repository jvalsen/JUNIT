package com.joanvaldes.tema4gradle;

public class Ejercicio3 {
    public static int contarPositivos(int[] datos) {
        int contador = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > 0) {
                contador++;
            }
        }
        return contador;
    }

}
