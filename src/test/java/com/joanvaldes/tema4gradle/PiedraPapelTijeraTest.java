package com.joanvaldes.tema4gradle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PiedraPapelTijeraTest {

    @Test
    void testJugadaInvalida() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio6.jugar("PIEDRA", "LAGARTO"));
    }

    @Test
    void testEmpate() {
        assertEquals("EMPATE", Ejercicio6.jugar("PAPEL", "PAPEL"));
    }

    @Test
    void testGanaJugador1() {
        assertEquals("GANA JUGADOR 1", Ejercicio6.jugar("PIEDRA", "TIJERA"));
        assertEquals("GANA JUGADOR 1", Ejercicio6.jugar("TIJERA", "PAPEL"));
        assertEquals("GANA JUGADOR 1", Ejercicio6.jugar("PAPEL", "PIEDRA"));
    }

    @Test
    void testGanaJugador2() {
        assertEquals("GANA JUGADOR 2", Ejercicio6.jugar("TIJERA", "PIEDRA"));
        assertEquals("GANA JUGADOR 2", Ejercicio6.jugar("PAPEL", "TIJERA"));
        assertEquals("GANA JUGADOR 2", Ejercicio6.jugar("PIEDRA", "PAPEL"));
    }
}
