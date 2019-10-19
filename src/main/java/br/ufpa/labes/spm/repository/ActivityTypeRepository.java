package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.types.ActivityTypeRepositoryQuery;


import br.ufpa.labes.spm.domain.ActivityType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ActivityType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ActivityTypeRepository extends ActivityTypeRepositoryQuery, JpaRepository<ActivityType, Long> {

}
