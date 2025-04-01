package edu.estatuas.cotxox.tarifa;

import edu.estatuas.cotxox.carrera.*;

public class Tarifa {

    private static final double COSTE_MILLA = 1.35;
    private static final double COSTE_MINUTO = 0.35;
    private static final double COSTE_MINIMO = 5f;
    private static final byte PORCENTAJE_COMISION = 20;

    public static double getCosteDistancia(double distancia) {
        return COSTE_MILLA * distancia;
    }

    public static double getCosteTiempo(int tiempo) {
        return COSTE_MINUTO * tiempo;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        double costeReal = getCosteDistancia(carrera.getDistancia())
                + getCosteTiempo(carrera.getTiempoEsperado());

        return costeReal > COSTE_MINIMO ? costeReal : COSTE_MINIMO;
    }
}
