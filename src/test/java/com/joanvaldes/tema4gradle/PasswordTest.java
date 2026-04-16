package com.joanvaldes.tema4gradle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordTest {

    @Test
    void testVacia() {
        assertEquals(0, Ejercicio7.evaluarPassword(""));
    }

    @Test
    void testSoloMinusculas() {
        assertEquals(1, Ejercicio7.evaluarPassword("abcdefg"));
    }

    @Test
    void testMayusculasYMinusculas() {
        assertEquals(2, Ejercicio7.evaluarPassword("Abcdefg"));
    }

    @Test
    void testConNumeros() {
        assertEquals(4, Ejercicio7.evaluarPassword("Abc12345"));
    }

    @Test
    void testConSimbolos() {
        assertEquals(5, Ejercicio7.evaluarPassword("Abc123$%"));
    }

    @Test
    void testSoloNumeros() {
        assertEquals(2, Ejercicio7.evaluarPassword("12345678"));
    }
}
