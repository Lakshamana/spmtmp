package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.resources.ReservationRepositoryQuery;


import br.ufpa.labes.spm.domain.Reservation;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Reservation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ReservationRepository extends ReservationRepositoryQuery, JpaRepository<Reservation, Long> {

}
