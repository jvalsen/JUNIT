package com.joanvaldes.tema4gradle;
public class Ejercicio7 {
    public static int evaluarPassword(String password) {
        int puntos = 0;
        if (password.length() >= 8) puntos++;
        if (password.matches(".*[A-Z].*")) puntos++;
        if (password.matches(".*[a-z].*")) puntos++;
        if (password.matches(".*[0-9].*")) puntos++;
        if (password.matches(".*[^A-Za-z0-9].*")) puntos++;

        return puntos;
    }
}
