package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.log.IProcessModelEventRepositoryQuery;


import br.ufpa.labes.spm.domain.ProcessModelEvent;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ProcessModelEvent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProcessModelEventRepository extends IProcessModelEventRepositoryQuery, JpaRepository<ProcessModelEvent, Long> {

}
