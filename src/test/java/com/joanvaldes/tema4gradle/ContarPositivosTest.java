package com.joanvaldes.tema4gradle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContarPositivosTest {

    @Test
    void testArrayVacio() {
        int[] datos = {};
        assertEquals(0, Ejercicio3.contarPositivos(datos));
    }

    @Test
    void testTodosNegativos() {
        int[] datos = {-3, -1, -7};
        assertEquals(0, Ejercicio3.contarPositivos(datos));
    }

    @Test
    void testMezclaValores() {
        int[] datos = {-1, 0, 4, 7, -3};
        assertEquals(2, Ejercicio3.contarPositivos(datos));
    }
}
