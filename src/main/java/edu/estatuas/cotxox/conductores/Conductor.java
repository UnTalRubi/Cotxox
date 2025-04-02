package edu.estatuas.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

    private String nombre;
    private String modelo;
    private String matricula;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

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
}
