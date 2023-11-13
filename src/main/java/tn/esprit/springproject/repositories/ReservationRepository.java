package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
