package tn.esprit.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idFoyer;

    private String nomFoyer;
    private long capacityFoyer;

    public long getIdFoyer() {
        return idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public long getCapacityFoyer() {
        return capacityFoyer;
    }


}
