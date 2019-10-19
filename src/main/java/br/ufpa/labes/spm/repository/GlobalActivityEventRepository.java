package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.log.GlobalActivityEventRepositoryQuery;


import br.ufpa.labes.spm.domain.GlobalActivityEvent;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the GlobalActivityEvent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GlobalActivityEventRepository extends GlobalActivityEventRepositoryQuery, JpaRepository<GlobalActivityEvent, Long> {

}
