package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Bloc  implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long idBloc;

    private String nomBloc;
    private long capaciteBloc;
    @ManyToOne
    private Foyer foyer;
    @OneToMany(mappedBy = "bloc")
    private List <Chamber> chamberList;

}
