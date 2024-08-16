package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chamber;
import tn.esprit.springproject.entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chamber,Long> {
    List<Chamber> findChambersByBloc(Bloc B);
    List<Chamber> findChambersByBloc_Foyer_Universite_NomUniversite(String nomUniversite);
    List<Chamber> findChambersByBloc_IdBlocAndAndTypeC(long idBloc, TypeChambre typeC);
}
