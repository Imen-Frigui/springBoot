package tn.esprit.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneUniversitaire;
    private boolean estValide;


}
