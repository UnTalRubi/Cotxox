package edu.estatuas.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;

public class PoolConductores {

    private List<Conductor> poolConductores = new ArrayList<>();

    public PoolConductores(List<Conductor> conductores) {

        this.poolConductores = conductores;
    }

    public List<Conductor> getPoolConductores() {
        return poolConductores;
    }

    /*
     * public Conductor asignarConductor(){
     * 
     * for (Conductor conductor : this.poolConductores){
     * if (conductor)
     * 
     * }
     * }
     */
}
