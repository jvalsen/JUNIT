package com.joanvaldes.tema4gradle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalificacionTest {

    @Test
    void testNotaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> Ejercicio4.calificacion(-1));
    }

    @Test
    void testNotaMayorQueDiez() {
        assertThrows(IllegalArgumentException.class, () -> Ejercicio4.calificacion(11));
    }

    @Test
    void testSuspenso() {
        assertEquals("SUSPENSO", Ejercicio4.calificacion(0));
        assertEquals("SUSPENSO", Ejercicio4.calificacion(4));
    }

    @Test
    void testSuficiente() {
        assertEquals("SUFICIENTE", Ejercicio4.calificacion(5));
    }

    @Test
    void testBien() {
        assertEquals("BIEN", Ejercicio4.calificacion(6));
    }

    @Test
    void testNotable() {
        assertEquals("NOTABLE", Ejercicio4.calificacion(7));
        assertEquals("NOTABLE", Ejercicio4.calificacion(8));
    }

    @Test
    void testSobresaliente() {
        assertEquals("SOBRESALIENTE", Ejercicio4.calificacion(9));
        assertEquals("SOBRESALIENTE", Ejercicio4.calificacion(10));
    }
}
