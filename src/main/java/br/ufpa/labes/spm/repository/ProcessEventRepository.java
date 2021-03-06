package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.log.ProcessEventRepositoryQuery;


import br.ufpa.labes.spm.domain.ProcessEvent;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ProcessEvent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProcessEventRepository extends ProcessEventRepositoryQuery, JpaRepository<ProcessEvent, Long> {

}
