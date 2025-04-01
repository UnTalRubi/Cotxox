package edu.estatuas.cotxox.carrera;

public class Carrera {

    private String tarjeraCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;

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

}
