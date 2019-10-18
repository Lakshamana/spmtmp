package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.log.IGlobalActivityEventRepositoryQuery;


import br.ufpa.labes.spm.domain.GlobalActivityEvent;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the GlobalActivityEvent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GlobalActivityEventRepository extends IGlobalActivityEventRepositoryQuery, JpaRepository<GlobalActivityEvent, Long> {

}
