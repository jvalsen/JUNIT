
package com.joanvaldes.tema4gradle;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SignoTest {

    @Test
    void testPositivo() {
        assertEquals(1, Ejercicio1.signo(10));
    }

    @Test
    void testNegativo() {
        assertEquals(-1, Ejercicio1.signo(-5));
    }

    @Test
    void testCero() {
        assertEquals(0, Ejercicio1.signo(0));
    }
}
