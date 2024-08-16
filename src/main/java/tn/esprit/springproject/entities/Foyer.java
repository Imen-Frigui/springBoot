package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capacityFoyer;
    @OneToOne(mappedBy = "foyer")
    @JsonBackReference
    private Universite universite;
    @OneToMany(mappedBy = "foyer")
    private List <Bloc> blocList;

}
