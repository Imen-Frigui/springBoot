package tn.esprit.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long idEtudiant;
    private String nomEt;
    private String prenomET;
    private long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean estValide;
}
