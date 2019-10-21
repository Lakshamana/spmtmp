package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.log.SpmLogRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.SpmLog;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the SpmLog entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SpmLogRepository extends BaseRepositoryQuery<SpmLog, Long>, JpaRepository<SpmLog, Long> {

}
