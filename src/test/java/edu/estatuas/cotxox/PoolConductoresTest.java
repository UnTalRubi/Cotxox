package edu.estatuas.cotxox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.estatuas.cotxox.conductores.Conductor;
import edu.estatuas.cotxox.conductores.PoolConductores;

public class PoolConductoresTest {

    List<Conductor> conductores = new ArrayList<>();

    Conductor conductoraA = new Conductor("Alva");
    Conductor conductoraB = new Conductor("Carlos");
    Conductor conductoraC = new Conductor("Patricia");
    Conductor conductoraD = new Conductor("Daniela");

    @BeforeEach
    public void createConductores() {

        conductores.clear();

        conductores.add(conductoraA);
        conductores.add(conductoraB);
        conductores.add(conductoraC);
        conductores.add(conductoraD);

        for (Conductor conductor : conductores) {
            conductor.setOcupado(false);
        }
    }

    @Test
    public void PoolConductoresMethodsTest() {
        PoolConductores poolConductores = new PoolConductores(conductores);

        assertEquals(conductores, poolConductores.getPoolConductores());

        assertEquals(conductoraA, poolConductores.asignarConductor());
    }
}
