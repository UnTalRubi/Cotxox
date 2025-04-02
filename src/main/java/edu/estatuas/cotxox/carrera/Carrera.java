package edu.estatuas.cotxox.carrera;

import java.util.List;

import edu.estatuas.cotxox.conductores.Conductor;
import edu.estatuas.cotxox.conductores.PoolConductores;
import edu.estatuas.cotxox.tarifa.Tarifa;

public class Carrera {

    private String tarjeraCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;
    private Conductor conductor;

    public Carrera(String tarjetaCredito) {
        this.tarjeraCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return tarjeraCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }

    public void asignarConductor(PoolConductores conductores) {

    }
}
