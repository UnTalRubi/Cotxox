package edu.estatuas.cotxox;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.estatuas.cotxox.carrera.Carrera;

public class CarreraTest {

    @Test
    public void constructCarreraTest() {

        String tarjeta = "1234567890335245";

        Carrera carrera = new Carrera("1234567890335245");
        assertEquals(tarjeta, carrera.getTarjetaCredito());

        carrera.setOrigen("Avenida del tomate");
        assertEquals("Avenida del tomate", carrera.getOrigen());

        carrera.setDestino("Calle de la lechuga");
        assertEquals("Calle de la lechuga", carrera.getDestino());

        carrera.setDistancia(11.4);
        assertEquals(11.4, carrera.getDistancia());

        carrera.setTiempoEsperado(15);
        assertEquals(15, carrera.getTiempoEsperado());
    }

    @Test
    public void getCosteTotalRealTest() {

        Carrera carrera = new Carrera("1234567890335245");
        carrera.setTiempoEsperado(13);
        carrera.setDistancia(10);

        assertEquals(18.05, carrera.getCosteEsperado());
    }

    @Test
    public void getCosteTotalMinimoTest() {

        Carrera carrera = new Carrera("1234567890335245");
        carrera.setTiempoEsperado(1);
        carrera.setDistancia(1);

        assertEquals(5., carrera.getCosteEsperado());
    }
}
