package edu.estatuas.cotxox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.estatuas.cotxox.conductores.Conductor;

public class ConductorTest {

    @Test
    public void constructConductorTest() {

        String name = "Roberto";

        Conductor conductor = new Conductor(name);

        assertEquals("Roberto", conductor.getNombre());
    }
}
