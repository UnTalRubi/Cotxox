package edu.estatuas.cotxox.carrera;

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
    private double costeTotal;
    private int propina;

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

        this.conductor = conductores.asignarConductor();
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void realizarPago(double costeEsperado) {
        this.costeTotal = costeEsperado;

    }

    public void recibirPropina(int propina) {

        this.propina = propina;
    }

    public int getPropina() {
        return propina;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public void liberarConductor() {
        this.conductor.setOcupado(false);
    }

}
