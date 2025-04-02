package edu.estatuas.cotxox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import edu.estatuas.cotxox.carrera.*;
import edu.estatuas.cotxox.conductores.*;
import edu.estatuas.cotxox.tarifa.Tarifa;

public class TarifaTest {

    @Test
    public void calcularCosteDistancia() {

        Tarifa tarifa = new Tarifa();

        assertEquals(16.2, tarifa.getCosteDistancia(12), 0.001);
        assertEquals(0, tarifa.getCosteDistancia(0));

    }
}
