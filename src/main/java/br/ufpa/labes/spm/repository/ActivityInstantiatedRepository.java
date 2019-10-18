package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IActivityInstantiatedRepositoryQuery;


import br.ufpa.labes.spm.domain.ActivityInstantiated;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ActivityInstantiated entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ActivityInstantiatedRepository extends IActivityInstantiatedRepositoryQuery, JpaRepository<ActivityInstantiated, Long> {

}
