package com.joanvaldes.tema4gradle;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClasificarEdadTest {

        @Test
        void testEdadNegativa() {
            assertThrows(IllegalArgumentException.class, () -> Ejercicio2.clasificarEdad(-1));
        }

        @Test
        void testInfancia() {
            assertEquals("Infancia", Ejercicio2.clasificarEdad(0));
            assertEquals("Infancia", Ejercicio2.clasificarEdad(5));
        }

        @Test
        void testNinez() {
            assertEquals("Niñez", Ejercicio2.clasificarEdad(6));
            assertEquals("Niñez", Ejercicio2.clasificarEdad(11));
        }

        @Test
        void testAdolescencia() {
            assertEquals("Adolescencia", Ejercicio2.clasificarEdad(12));
            assertEquals("Adolescencia", Ejercicio2.clasificarEdad(17));
        }

        @Test
        void testJuventud() {
            assertEquals("Juventud", Ejercicio2.clasificarEdad(18));
            assertEquals("Juventud", Ejercicio2.clasificarEdad(24));
        }

        @Test
        void testAdultez() {
            assertEquals("Adultez", Ejercicio2.clasificarEdad(25));
            assertEquals("Adultez", Ejercicio2.clasificarEdad(59));
        }

        @Test
        void testVejez() {
            assertEquals("Vejez", Ejercicio2.clasificarEdad(60));
            assertEquals("Vejez", Ejercicio2.clasificarEdad(90));
        }
    }


