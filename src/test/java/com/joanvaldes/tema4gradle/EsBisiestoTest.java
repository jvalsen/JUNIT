package com.joanvaldes.tema4gradle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EsBisiestoTest {

    @Test
    void testDivisiblePor4NoPor100() {
        assertTrue(Ejercicio5.esBisiesto(2024));
    }

    @Test
    void testDivisiblePor100NoPor400() {
        assertFalse(Ejercicio5.esBisiesto(1900));
    }

    @Test
    void testDivisiblePor400() {
        assertTrue(Ejercicio5.esBisiesto(2000));
    }

    @Test
    void testNoDivisiblePor4() {
        assertFalse(Ejercicio5.esBisiesto(2023));
    }
}
