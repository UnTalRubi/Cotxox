package edu.estatuas.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private ArrayList<Byte> valoraciones = new ArrayList<>();
    private boolean ocupado = false;

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public int getNumeroValoraciones() {
        return valoraciones.size();
    }

    private double calcularValoracionMedia() {

        double sumValoraciones = 0;
        for (Byte valoracion : valoraciones) {
            sumValoraciones += valoracion;
        }
        return sumValoraciones / getNumeroValoraciones();
    }

    public double getValoracion() {

        this.valoracionMedia = calcularValoracionMedia();
        return this.valoracionMedia;
    }
}
