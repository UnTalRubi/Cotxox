package edu.estatuas.cotxox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.estatuas.cotxox.tarifa.Tarifa;

public class TarifaTest {

    @Test
    public void calcularCosteDistancia() {

        Tarifa tarifa = new Tarifa();

        assertEquals(16.2, tarifa.getCosteDistancia(12), 0.001);
        assertEquals(0, tarifa.getCosteDistancia(0));
    }

    @Test
    public void calcularCosteTiempo() {

        Tarifa tarifa = new Tarifa();

        assertEquals(1.75, tarifa.getCosteTiempo(5));
        assertEquals(9.1, tarifa.getCosteTiempo(26));
    }
}
