package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Chamber;

public interface ChambreRepository extends JpaRepository<Chamber,Long> {
}
