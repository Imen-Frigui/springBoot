package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
