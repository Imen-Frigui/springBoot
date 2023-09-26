package tn.esprit.springproject.entities;

import jakarta.persistence.*;

@Entity
public class Chamber {
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}
