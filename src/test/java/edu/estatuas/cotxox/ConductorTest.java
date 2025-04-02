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

    @Test
    public void valoracionesTest() {

        Conductor conductor = new Conductor("Paul");

        conductor.setValoracion((byte) 3);
        conductor.setValoracion((byte) 4);
        conductor.setValoracion((byte) 5);

        assertEquals(3, conductor.getNumeroValoraciones());
        assertEquals(4, conductor.getValoracion());
    }

    @Test
    public void matriculasTest() {

        Conductor conductor = new Conductor("John");

        conductor.setMatricula("352ABA");
        assertEquals("352ABA", conductor.getMatricula());
    }

    @Test
    public void modelosTest() {

        Conductor conductor = new Conductor("Amy");

        conductor.setModelo("Mercedes");
        assertEquals("Mercedes", conductor.getModelo());
    }
}
