package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;
    private String prenomET;
    private long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean estValide;
    @ManyToMany(mappedBy = "etudiantList")
    private List <Reservation> reservationList;
}
