package com.joanvaldes.tema4gradle;

public class Ejercicio5 {

    public static boolean esBisiesto(int anyo) {
        return (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
    }
}
