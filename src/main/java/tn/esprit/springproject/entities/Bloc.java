package tn.esprit.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Bloc  implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long idBloc;

    private String nomBloc;
    private long capaciteBloc;

}
