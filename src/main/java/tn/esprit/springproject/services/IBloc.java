package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chamber;
import tn.esprit.springproject.entities.TypeChambre;

import java.util.List;
import java.util.Set;

public interface IBloc {
    public List<Bloc> findByChamberListTypeC(TypeChambre type);
}
