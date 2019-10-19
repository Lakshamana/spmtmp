package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.log.ModelingActivityEventRepositoryQuery;


import br.ufpa.labes.spm.domain.ModelingActivityEvent;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ModelingActivityEvent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ModelingActivityEventRepository extends ModelingActivityEventRepositoryQuery, JpaRepository<ModelingActivityEvent, Long> {

}
